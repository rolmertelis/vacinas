package br.com.telis.vacinas.controller.form;

import br.com.telis.vacinas.model.Aplicacao;
import br.com.telis.vacinas.model.Vacina;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class AplicacaoForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String dataaplicacao;
    private String obs;


    public Aplicacao criarAplicacaoModel(AplicacaoForm aplicacaoForm){
        Aplicacao aplicacao = new Aplicacao();
            aplicacao.setId(aplicacaoForm.getId());
            aplicacaoForm.setDataaplicacao(getDataaplicacao());
            aplicacaoForm.setObs(getObs());
            return aplicacao;
    }

}
