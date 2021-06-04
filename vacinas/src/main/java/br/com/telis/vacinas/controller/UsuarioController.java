package br.com.telis.vacinas.controller;

import br.com.telis.vacinas.controller.form.UsuarioForm;
import br.com.telis.vacinas.dto.UsuarioDTO;
import br.com.telis.vacinas.model.Usuario;
import br.com.telis.vacinas.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {


//    //opção 1 - usando Autowired
//    @Autowired
//    UsuarioService usuarioService;


    //opção 2 - usanndo construtor único, que recebe o service
    //fazedo a injelção de dependências através do construtor
    private UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @PostMapping
    public ResponseEntity<UsuarioDTO> cadastrar(@RequestBody @Valid UsuarioForm usuarioForm, UriComponentsBuilder uriComponentsBuilder) {
        Usuario usuarioModel = UsuarioForm.criarUsuarioModel(usuarioForm);
        Usuario usuarioSalvo = usuarioService.salvar(usuarioModel);
        UsuarioDTO usuarioDTO = new UsuarioDTO(usuarioSalvo);
        URI uri = uriComponentsBuilder.path("usuario/{id}").buildAndExpand(usuarioDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(usuarioDTO);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<UsuarioDTO> atualizar(@PathVariable Integer id, @RequestBody @Valid UsuarioForm usuarioForm, UriComponentsBuilder uriComponentsBuilder) {
        Usuario usuarioSalvo =  usuarioService.atualizaUmUsuario( id,usuarioForm);
        UsuarioDTO usuarioParaRetornar = new UsuarioDTO(usuarioSalvo);
        URI uri = uriComponentsBuilder.path("usuario/{id}").buildAndExpand(usuarioParaRetornar.getId()).toUri();
        return ResponseEntity.created(uri).body(usuarioParaRetornar);
    }


    @GetMapping(path = {"/{id}"})
    public ResponseEntity<UsuarioDTO> retornaUm(@PathVariable Integer id, UriComponentsBuilder uriComponentsBuilder) {
        Usuario usuarioEncontrado = usuarioService.retornaUm(id);
        UsuarioDTO usuarioDTO = new UsuarioDTO(usuarioEncontrado);
        URI uri = uriComponentsBuilder.path("usuario/{id}").buildAndExpand(usuarioDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(usuarioDTO);
        //return ResponseEntity.status(HttpStatus.CREATED).body("tudo certo");
    }

    @GetMapping
    public List Findall() {
        return usuarioService.retornaLista();
    }


}
