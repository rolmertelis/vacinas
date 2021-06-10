package br.com.telis.vacinas.dto;


import br.com.telis.vacinas.model.Usuario;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioListaDTO {


    private ModelMapper mm;
    public UsuarioListaDTO() {
        mm = new ModelMapper();
    }


    public List<UsuarioDTO> criaListaUsuarioDTO(List<Usuario> listaUsuarioModel){
        return listaUsuarioModel.stream().map(this::modelParaDTO).collect(Collectors.toList());
    }


    public Page<UsuarioDTO> criaPageUsuarioDTO(Page<Usuario> PageUsuarioModel){
        Page<UsuarioDTO> dtoPage = PageUsuarioModel.map(this::modelParaDTO);
        return dtoPage;
    }
    private UsuarioDTO modelParaDTO(Usuario usuarioModel){
        return this.mm.map(usuarioModel, UsuarioDTO.class);
    }


}
