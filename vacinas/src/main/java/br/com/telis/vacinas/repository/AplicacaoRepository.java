package br.com.telis.vacinas.repository;

import br.com.telis.vacinas.model.Aplicacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface AplicacaoRepository extends JpaRepository<Aplicacao, Integer>,
        JpaSpecificationExecutor<Aplicacao> {


}
