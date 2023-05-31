package br.com.gestaosprinter.sprinter.infra;

import br.com.gestaosprinter.sprinter.domain.Sprinter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface SprinterSpringDataJPARepository extends JpaRepository<Sprinter, UUID> {

}
