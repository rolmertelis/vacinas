package br.com.telis.vacinas.service;

import br.com.telis.vacinas.controller.form.UsuarioForm;
import br.com.telis.vacinas.dto.UsuarioDTO;
import br.com.telis.vacinas.model.Usuario;
import br.com.telis.vacinas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario)
    {
        return usuarioRepository.save(usuario);
    }

    public Usuario retornaUm(Integer id){
        Usuario encontrado = usuarioRepository.getOne(id);
        return encontrado;
    }

    public Usuario atualizaUmUsuario(Integer id, UsuarioForm usuarioForm){
        Usuario usuarioExistente = retornaUm(id);
        usuarioExistente.setId(id);
        usuarioExistente.setNome(usuarioForm.getNome());
        usuarioExistente.setEmail(usuarioForm.getEmail());
        usuarioExistente.setCpf(usuarioForm.getCpf());
        usuarioExistente.setNascimento(usuarioForm.getNascimento());
        return usuarioRepository.save(usuarioExistente);
    }

    //Sem paginação menhuma
    public List<Usuario> retornaLista(){
        return  usuarioRepository.findAll();
    }

    //Com paginação pré definida no controller
    public Page<Usuario> retornaLista(Pageable pageble){
        return usuarioRepository.findAll(pageble);
    }



}
