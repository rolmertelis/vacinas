package br.com.telis.vacinas.controller;
import br.com.telis.vacinas.dto.AplicacaoDTO;
import br.com.telis.vacinas.model.Aplicacao;
import br.com.telis.vacinas.service.AplicacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/aplicacao")
public class AplicacaoController {

    @Autowired
    AplicacaoService aplicacaoService;

    //O método retorna um ResponseEntity - classe que representa um response http com
    //tudo que tem direito: código de status, cabeçalhos e corpo

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<AplicacaoDTO> retornaUm (@PathVariable Integer id, UriComponentsBuilder uriComponentsBuilder){
        Aplicacao aplicacaoEncontrada = aplicacaoService.retornaUm(id);
        AplicacaoDTO aplicacaoDTO = new AplicacaoDTO(aplicacaoEncontrada);
        URI uri = uriComponentsBuilder.path("aplicacao/{id}").buildAndExpand(aplicacaoDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(aplicacaoDTO);
    }



}
