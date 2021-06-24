package br.com.telis.vacinas.repository;

import br.com.telis.vacinas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> ,
        JpaSpecificationExecutor<Usuario> {

    Optional<Usuario> findUsuarioByEmail(String email);

}


