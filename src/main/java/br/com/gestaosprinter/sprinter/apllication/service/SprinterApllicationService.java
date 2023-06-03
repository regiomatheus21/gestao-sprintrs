package br.com.gestaosprinter.sprinter.apllication.service;

import br.com.gestaosprinter.sprinter.apllication.api.*;
import br.com.gestaosprinter.sprinter.apllication.repository.SprinterRepository;
import br.com.gestaosprinter.sprinter.domain.Sprinter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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

    @Override
    public SprinterDetalhadoResponse buscaSprinterAtravesId(UUID idSprinter) {
        log.info("[inicia] SprinterApllicationService - buscaSprinterAtravesId");
        Sprinter sprinter = sprinterRepository.buscaSprinterAtravesId(idSprinter);
        log.info("[finaliza] SprinterApllicationService - buscaSprinterAtravesId");
        return new SprinterDetalhadoResponse(sprinter);
    }

    @Override
    public void deletaSprinterAtravesId(UUID idSprinter) {
        log.info("[inicia] SprinterApllicationService - deletaSprinterAtravesId");
        Sprinter sprinter = sprinterRepository.buscaSprinterAtravesId(idSprinter);
        sprinterRepository.deletaSprinter(sprinter);
        log.info("[finaliza] SprinterApllicationService - deletaSprinterAtravesId");
    }

    @Override
    public void editaDadosSprinter(UUID idSprinter, SprinterAlteracaoRequest sprinterAlteracaoRequest) {
        log.info("[inicia] SprinterApllicationService - editaDadosSprinter");
        Sprinter sprinter = sprinterRepository.buscaSprinterAtravesId(idSprinter);
        sprinter.altera(sprinterAlteracaoRequest);
        sprinterRepository.salva(sprinter);
        log.info("[finaliza] SprinterApllicationService - editaDadosSprinter");


    }
}
