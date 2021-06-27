package br.com.telis.vacinas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class IndexController {

    Map<String, String>  map = Map.ofEntries(
            Map.entry("Vacinas", "/vacina"),
            Map.entry("Usuários", "/usuario"),
            Map.entry("Aplicacoes", "/aplicacao")
    ) ;

    @GetMapping
    ResponseEntity instrucoes (UriComponentsBuilder ucb){
        URI uri = ucb.path("index").buildAndExpand().toUri();
        return ResponseEntity.status(HttpStatus.FOUND).body(map);
    }
}
