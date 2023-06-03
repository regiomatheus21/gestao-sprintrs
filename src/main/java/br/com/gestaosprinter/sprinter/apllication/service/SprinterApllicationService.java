package br.com.gestaosprinter.sprinter.apllication.service;

import br.com.gestaosprinter.sprinter.apllication.api.SprinterListResponse;
import br.com.gestaosprinter.sprinter.apllication.api.SprinterRequest;
import br.com.gestaosprinter.sprinter.apllication.api.SprinterResponse;
import br.com.gestaosprinter.sprinter.apllication.repository.SprinterRepository;
import br.com.gestaosprinter.sprinter.domain.Sprinter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class SprinterApllicationService implements sprinterService{
    private final SprinterRepository sprinterRepository;
    @Override
    public SprinterResponse criaSprinter(SprinterRequest sprinterRequest) {
        log.info("[inicia] SprinterApllicationService- criaSprinter ");
        Sprinter sprinter = sprinterRepository.salva(new Sprinter(sprinterRequest));
        log.info("[finaliza] SprinterApllicationService- criaSprinter ");
        return SprinterResponse.builder().idSprinter(sprinter.getIdSprinter()).build();

    }

    @Override
    public List<SprinterListResponse> buscaTodosSprinters() {
        log.info("[inicia] SprinterApllicationService - buscaTodosSprinters");
        List <Sprinter> sprinters = sprinterRepository.buscaTodosSprinters();
        log.info("[finaliza] SprinterApllicationService - buscaTodosSprinters");
        return SprinterListResponse.converte(sprinters);
    }
}
