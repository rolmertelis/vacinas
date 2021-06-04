package br.com.telis.vacinas.controller.form;

import br.com.telis.vacinas.model.Aplicacao;
import br.com.telis.vacinas.model.Vacina;
import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class VacinaForm {
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
    private List<Aplicacao> aplicacoes;

    public VacinaForm() {
    }

    public VacinaForm(Vacina vacina) {
        this.nome = vacina.getNome();
        this.sigla = vacina.getSigla();
        this.periodicidade = vacina.getPeriodicidade();
        this.doses = vacina.getDoses();
        this.diasentredoses = vacina.getDiasentredoses();
        this.aplicacoes = vacina.getAplicacoes();

    }

    public Vacina criarVacinaModel(VacinaForm vacinaForm){
        Vacina vacina = new Vacina();
        vacina.setNome(vacinaForm.getNome());
        vacina.setSigla(vacinaForm.getSigla());
        vacina.setPeriodicidade(vacinaForm.getPeriodicidade()) ;
        vacina.setDoses(vacinaForm.getDoses());
        vacina.setDiasentredoses(vacinaForm.getDiasentredoses());
        return vacina;
    }

}
