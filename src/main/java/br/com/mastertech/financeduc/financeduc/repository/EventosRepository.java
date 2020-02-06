package br.com.mastertech.financeduc.financeduc.repository;
import br.com.mastertech.financeduc.financeduc.model.Eventos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EventosRepository extends CrudRepository<Eventos, Long> {
    Optional<Eventos> findByNome(String nome);

}
