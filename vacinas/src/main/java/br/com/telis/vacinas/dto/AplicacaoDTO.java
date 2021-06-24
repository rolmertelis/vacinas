package br.com.telis.vacinas.dto;

import br.com.telis.vacinas.model.Aplicacao;
import br.com.telis.vacinas.model.Usuario;
import br.com.telis.vacinas.model.Vacina;


public class AplicacaoDTO {
    private Integer id;
    private Usuario usuario;
    private String dataaplicacao;
    private String obs;
    private Vacina vacina;

    public AplicacaoDTO() {
    }

    public AplicacaoDTO(Integer id, Usuario usuario, String dataaplicacao, String obs, Vacina vacina) {
        this.id = id;
        this.usuario = usuario;
        this.dataaplicacao = dataaplicacao;
        this.obs = obs;
        this.vacina = vacina;
    }

    public AplicacaoDTO(Aplicacao aplicacao) {
        this.id = aplicacao.getId();
        this.usuario = aplicacao.getUsuario();
        this.dataaplicacao = getDataaplicacao();
        this.obs = aplicacao.getObs();
        this.vacina = aplicacao.getVacina();
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
