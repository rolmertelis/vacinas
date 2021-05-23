package br.com.telis.vacinas.dto;

import br.com.telis.vacinas.model.Vacina;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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


    public VacinaDTO(Vacina vacina){
        this.setId(vacina.getId());
        this.setNome(vacina.getNome());
        this.setSigla(vacina.getSigla());
        this.setDoses(vacina.getDoses());
        this.setPeriodicidade(vacina.getPeriodicidade());
        this.setDiasentredoses(vacina.getDiasentredoses());
    }

    public VacinaDTO(){

    }


}
