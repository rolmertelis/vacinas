package br.com.telis.vacinas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(uniqueConstraints={
        @UniqueConstraint(columnNames = "nome", name="nome_UNIQUE"),
        @UniqueConstraint(columnNames = "sigla", name="sigla_UNIQUE")
}
)
public class Vacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String sigla;
    private Integer periodicidade;
    private Integer doses;
    private Integer diasentredoses;
    @JsonIgnore
    @OneToMany(mappedBy = "vacina", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Aplicacao> aplicacoes;

    public Vacina() {
    }

    public Vacina(Integer id, String nome, String sigla, Integer periodicidade, Integer doses, Integer diasentredoses, List<Aplicacao> aplicacoes) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.periodicidade = periodicidade;
        this.doses = doses;
        this.diasentredoses = diasentredoses;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(Integer periodicidade) {
        this.periodicidade = periodicidade;
    }

    public Integer getDoses() {
        return doses;
    }

    public void setDoses(Integer doses) {
        this.doses = doses;
    }

    public Integer getDiasentredoses() {
        return diasentredoses;
    }

    public void setDiasentredoses(Integer diasentredoses) {
        this.diasentredoses = diasentredoses;
    }

    public List<Aplicacao> getAplicacoes() {
        return aplicacoes;
    }

    public void setAplicacoes(List<Aplicacao> aplicacoes) {
        this.aplicacoes = aplicacoes;
    }


}
