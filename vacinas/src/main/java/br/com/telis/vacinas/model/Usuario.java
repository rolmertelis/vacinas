package br.com.telis.vacinas.model;

import javax.persistence.*;
import java.util.List;

@Table(name = "usuario",
        uniqueConstraints ={
        @UniqueConstraint(columnNames = "email", name = "email_UNIQUE"),
        @UniqueConstraint(columnNames = "cpf", name = "cpf_UNIQUE")
}
)
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String nascimento;
    private String cpf;

    //Um usuário pode tomar várias vacinas
    @OneToMany(mappedBy = "usuario")
    private List<Aplicacao> aplicacoes;

    public Usuario() {

    }

    public Usuario(Integer id, String nome, String email, String nascimento, String cpf, List<Aplicacao> aplicacoes) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.aplicacoes = aplicacoes;

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

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
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

    public void setAplicacoes(List<Aplicacao> aplicacaos) {
        this.aplicacoes = aplicacoes;
    }

}
