package br.com.telis.vacinas.dto;

import br.com.telis.vacinas.model.Aplicacao;
import br.com.telis.vacinas.model.Vacina;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class VacinaDTO {
    @Getter @Setter
    private Integer id;
    @Getter @Setter @NotNull @NotEmpty @NotBlank
    private String nome;
    @Getter @Setter @NotNull @NotEmpty @NotBlank
    private String sigla;
    @Getter @Setter
    private Integer periodicidade;
    @Getter @Setter
    private Integer doses;
    @Getter @Setter
    private Integer diasentredoses;

    @Getter @Setter
    private List<Aplicacao> aplicacaos;

    public VacinaDTO(Vacina vacina){
        this.setId(vacina.getId());
        this.setNome(vacina.getNome());
        this.setSigla(vacina.getSigla());
        this.setDoses(vacina.getDoses());
        this.setPeriodicidade(vacina.getPeriodicidade());
        this.setDiasentredoses(vacina.getDiasentredoses());

        this.setAplicacaos(vacina.getAplicacoes());

    }

    public VacinaDTO(){

    }


}
