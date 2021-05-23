package br.com.telis.vacinas.controller.form;

import br.com.telis.vacinas.model.Usuario;
import br.com.telis.vacinas.model.Vacinacao;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class UsuarioForm {

    @Getter @Setter @NotNull @NotEmpty @NotBlank
    private String nome;
    @Getter @Setter @NotNull @NotEmpty @NotBlank
    private String email;
    @Getter @Setter @NotNull @NotEmpty @NotBlank
    private String nascimento;
    @Getter @Setter @NotNull @NotEmpty @NotBlank
    private String cpf;

    public UsuarioForm() {}

    public UsuarioForm(Usuario usuario) {
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.nascimento = usuario.getNascimento();
        this.cpf = usuario.getCpf();
    }

    public static Usuario criarUsuarioModel(UsuarioForm usuarioForm){
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioForm.getNome());
        usuario.setEmail(usuarioForm.getEmail());
        usuario.setCpf(usuarioForm.getCpf());
        usuario.setNascimento(usuarioForm.getNascimento());
        return usuario;
    }
}
