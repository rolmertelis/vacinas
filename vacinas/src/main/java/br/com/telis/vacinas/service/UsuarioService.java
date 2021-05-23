package br.com.telis.vacinas.service;

import br.com.telis.vacinas.model.Usuario;
import br.com.telis.vacinas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario retornaUm(Integer id){
        return usuarioRepository.getOne(id);
    }
}
