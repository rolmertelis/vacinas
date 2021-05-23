package br.com.telis.vacinas.dto;

import br.com.telis.vacinas.model.Usuario;
import lombok.Getter;
import lombok.Setter;

public class UsuarioDTO{
    @Getter @Setter
    private Integer id;
    @Getter @Setter
    private String nome;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String dataNascimento;
    @Getter @Setter
    private String cpf;

    public UsuarioDTO() {

    }

    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.dataNascimento = usuario.getNascimento();
        this.cpf = usuario.getCpf();
    }
}
