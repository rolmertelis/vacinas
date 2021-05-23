package br.com.telis.vacinas.service;

import br.com.telis.vacinas.model.Vacina;
import br.com.telis.vacinas.repository.VacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacinaService {
    @Autowired
    VacinaRepository vacinaRepository;

    public Vacina salvar(Vacina vacina){
        return vacinaRepository.save(vacina);
    }

    public Vacina retornaUm(Integer id){
        return vacinaRepository.getOne(id);
    }

}
