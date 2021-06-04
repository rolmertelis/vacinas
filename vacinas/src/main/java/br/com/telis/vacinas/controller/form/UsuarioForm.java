package br.com.telis.vacinas.controller.form;

import br.com.telis.vacinas.model.Aplicacao;
import br.com.telis.vacinas.model.Usuario;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class UsuarioForm {
    @Getter @Setter
    private Integer id;
    @Getter @Setter @NotNull @NotEmpty @NotBlank
    private String nome;
    @Getter @Setter @NotNull @NotEmpty @NotBlank
    private String email;
    @Getter @Setter @NotNull @NotEmpty @NotBlank
    private String nascimento;
    @Getter @Setter @NotNull @NotEmpty @NotBlank
    private String cpf;
    @Getter @Setter
    private List<Aplicacao> aplicacoes;


    public UsuarioForm() {}

    public UsuarioForm(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.nascimento = usuario.getNascimento();
        this.cpf = usuario.getCpf();
        this.aplicacoes = usuario.getAplicacoes();

    }

    public static Usuario criarUsuarioModel(UsuarioForm usuarioForm){
        Usuario usuario = new Usuario();
                usuario.setId(usuarioForm.getId());
                usuario.setNome(usuarioForm.getNome());
                usuario.setEmail(usuarioForm.getEmail());
                usuario.setCpf(usuarioForm.getCpf());
                usuario.setNascimento(usuarioForm.getNascimento());
                usuario.setAplicacoes(usuarioForm.getAplicacoes());

                return usuario;
    }
}
