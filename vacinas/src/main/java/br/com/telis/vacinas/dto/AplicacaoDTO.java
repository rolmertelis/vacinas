package br.com.telis.vacinas.dto;

import br.com.telis.vacinas.model.Aplicacao;
import br.com.telis.vacinas.model.Usuario;
import br.com.telis.vacinas.model.Vacina;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Data
public class AplicacaoDTO {
    private Integer id;
    private Usuario usuario;
    private String dataaplicacao;
    private String obs;
    private Vacina vacina;

    public AplicacaoDTO() {

    }

    public AplicacaoDTO(Aplicacao aplicacao) {
        this.id = aplicacao.getId();
        this.usuario = aplicacao.getUsuario();
        this.dataaplicacao = aplicacao.getDataaplicacao();
        this.obs = aplicacao.getObs();
        this.vacina = aplicacao.getVacina();
    }
}
