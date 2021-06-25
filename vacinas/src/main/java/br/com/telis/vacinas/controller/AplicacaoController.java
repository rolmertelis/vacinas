package br.com.telis.vacinas.controller;
import br.com.telis.vacinas.controller.form.AplicacaoForm;
import br.com.telis.vacinas.dto.AplicacaoDTO;
import br.com.telis.vacinas.model.Aplicacao;
import br.com.telis.vacinas.model.Usuario;
import br.com.telis.vacinas.model.Vacina;
import br.com.telis.vacinas.service.AplicacaoService;
import br.com.telis.vacinas.service.UsuarioService;
import br.com.telis.vacinas.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/aplicacao")
public class AplicacaoController {

    @Autowired
    AplicacaoService aplicacaoService;
    @Autowired
    VacinaService vacinaService;
    @Autowired
    UsuarioService usuarioService;

    //O método retorna um ResponseEntity - classe que representa um response http com
    //tudo que tem direito: código de status, cabeçalhos e corpo
    @GetMapping(path = {"/{id}"})
    public ResponseEntity<AplicacaoDTO> retornaUm (@PathVariable Integer id, UriComponentsBuilder uriComponentsBuilder){
        Aplicacao aplicacaoEncontrada = aplicacaoService.retornaUm(id);
        AplicacaoDTO aplicacaoDTO = new AplicacaoDTO(aplicacaoEncontrada);
        URI uri = uriComponentsBuilder.path("aplicacao/{id}").buildAndExpand(aplicacaoDTO.getId()).toUri();
        //Se deu tudo certo, o status retornado será 302 (found - encontrado)
        return ResponseEntity.status(HttpStatus.FOUND).body(aplicacaoDTO);
    }


    @PostMapping
    public ResponseEntity<AplicacaoDTO> aplicaVacina(@RequestBody @Valid AplicacaoForm aplicacaoForm, UriComponentsBuilder ucb){
        Usuario u = usuarioService.retornaUm(aplicacaoForm.getUsuario());
        Vacina v = vacinaService.retornaUm((aplicacaoForm.getVacina()));

        Aplicacao aplicacaoModel = aplicacaoForm.criarAplicacaoModel(aplicacaoForm, u, v);
        Aplicacao aplicacaoSalva = aplicacaoService.aplicarVacina(aplicacaoModel);
        AplicacaoDTO aplicacaoDTO = new AplicacaoDTO(aplicacaoSalva);
        URI uri = ucb.path("aplicacao/{id}").buildAndExpand(aplicacaoDTO.getId()).toUri();
        //Como o método pretende incluir um recurso, se der tudo certo retorna created
        ResponseEntity re = ResponseEntity.created(uri).body(aplicacaoDTO);
        return re;

    }





}
