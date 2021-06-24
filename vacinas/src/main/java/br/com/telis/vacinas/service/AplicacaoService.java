package br.com.telis.vacinas.service;

import br.com.telis.vacinas.controller.form.AplicacaoForm;
import br.com.telis.vacinas.dto.AplicacaoDTO;
import br.com.telis.vacinas.model.Aplicacao;
import br.com.telis.vacinas.repository.AplicacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AplicacaoService {

    @Autowired
    AplicacaoRepository aplicacaoRepository;

    public Aplicacao retornaUm(Integer id){
        return aplicacaoRepository.findById(id).get();
    }

}
