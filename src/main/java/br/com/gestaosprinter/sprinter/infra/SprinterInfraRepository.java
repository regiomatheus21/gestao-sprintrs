package br.com.gestaosprinter.sprinter.infra;

import br.com.gestaosprinter.handler.APIException;
import br.com.gestaosprinter.sprinter.apllication.repository.SprinterRepository;
import br.com.gestaosprinter.sprinter.domain.Sprinter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class SprinterInfraRepository implements SprinterRepository {
    private final SprinterSpringDataJPARepository sprinterSpringDataJPARepository;



    @Override
    public Sprinter salva(Sprinter sprinter) {
        log.info("[inicia] SprinterInfraRepository- salva");
        try {
            sprinterSpringDataJPARepository.save(sprinter);
        }catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST,"existe dados duplicados",e);
        }
        log.info("[inicia] SprinterInfraRepository- salva");
        return sprinter;
    }
    @Override
    public List<Sprinter> buscaTodosSprinters() {
        log.info("[inicia] SprinterInfraRepository - buscaTodosSprinters");
        List<Sprinter> todosSprinter = sprinterSpringDataJPARepository.findAll();
        log.info("[finaliza] SprinterInfraRepository - buscaTodosSprinters");
        return todosSprinter;
    }
}
