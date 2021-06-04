package br.com.telis.vacinas.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="aplicacao")
public class Aplicacao {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn( name="usuario_id")
    private Usuario usuario;

    private String dataaplicacao;
    private String obs;

    //@JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "vacina_id")
    private Vacina vacina;


    public Aplicacao() {

    }

    public Aplicacao(Integer id, Usuario usuario, String dataaplicacao, String obs, Vacina vacina) {
        this.id = id;
        this.usuario = usuario;
        this.dataaplicacao = dataaplicacao;
        this.obs = obs;
        this.vacina = vacina;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataaplicacao() {
        return dataaplicacao;
    }

    public void setDataaplicacao(String dataaplicacao) {
        this.dataaplicacao = dataaplicacao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }
}
