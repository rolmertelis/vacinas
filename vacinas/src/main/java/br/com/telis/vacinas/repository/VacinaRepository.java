package br.com.telis.vacinas.repository;

import br.com.telis.vacinas.model.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VacinaRepository extends JpaRepository<Vacina, Integer> {
    Optional<Vacina> findByNome(String nome);
}
