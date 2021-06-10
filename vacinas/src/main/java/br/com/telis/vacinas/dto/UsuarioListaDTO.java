package br.com.telis.vacinas.dto;


import br.com.telis.vacinas.model.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioListaDTO {

    public List<UsuarioDTO> criaListaUsuarioDTO(List<Usuario> listaUsuarios){
        return listaUsuarios.stream().map(this::paraUsuarioDTO).collect(Collectors.toList());
    }

    private UsuarioDTO paraUsuarioDTO(Usuario usuarioModel){
        var usuarioDTO = new UsuarioDTO();
        return usuarioDTO;
    }

}
