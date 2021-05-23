package br.com.telis.vacinas.controller;


import br.com.telis.vacinas.controller.form.UsuarioForm;
import br.com.telis.vacinas.controller.form.VacinaForm;
import br.com.telis.vacinas.dto.UsuarioDTO;
import br.com.telis.vacinas.dto.VacinaDTO;
import br.com.telis.vacinas.model.Usuario;
import br.com.telis.vacinas.model.Vacina;
import br.com.telis.vacinas.repository.VacinaRepository;
import br.com.telis.vacinas.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/vacina")
public class VacinaController {

    @Autowired
    VacinaService vacinaService;

    @PostMapping
    public ResponseEntity<VacinaDTO>cadastrar(@RequestBody @Valid VacinaForm vacinaForm, UriComponentsBuilder uriComponentsBuilder){
        Vacina vacinaModel = vacinaForm.criarVacinaModel(vacinaForm);
        Vacina vacinaSalva = vacinaService.salvar(vacinaModel);
        VacinaDTO vacinaDTO = new VacinaDTO(vacinaSalva);
        URI uri = uriComponentsBuilder.path("vacina/{id}").buildAndExpand(vacinaDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(vacinaDTO);
    }


    @GetMapping
    public ResponseEntity<VacinaDTO> retornaUm(@RequestParam(name="id") Integer id, UriComponentsBuilder uriComponentsBuilder){
        Vacina vacinaEncontrada = vacinaService.retornaUm(id);
        VacinaDTO vacinaDTO = new VacinaDTO(vacinaEncontrada);
        URI uri = uriComponentsBuilder.path("vacina/{id}").buildAndExpand(vacinaDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(vacinaDTO);
        //return ResponseEntity.status(HttpStatus.CREATED).body("tudo certo");
    }


}
