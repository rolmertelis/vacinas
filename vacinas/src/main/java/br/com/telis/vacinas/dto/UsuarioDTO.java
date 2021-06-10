package br.com.telis.vacinas.dto;
import br.com.telis.vacinas.model.Aplicacao;
import br.com.telis.vacinas.model.Usuario;
import java.util.List;


//Finalidade: Produzir objetos apropriados para serem entregues nos responses
//preservando a integridade dos objetos de modelo de negócio
public class UsuarioDTO{
    public final String mensagem = "Este é um objeto DTO";
    private Integer id;
    private String nome;
    private String email;
    private String dataNascimento;
    private String cpf;
    private List<Aplicacao> aplicacoes;

    public UsuarioDTO() {

    }

    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.dataNascimento = usuario.getNascimento();
        this.cpf = usuario.getCpf();
        this.aplicacoes = usuario.getAplicacoes();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Aplicacao> getAplicacoes() {
        return aplicacoes;
    }

    public void setAplicacoes(List<Aplicacao> aplicacoes) {
        this.aplicacoes = aplicacoes;
    }
}
