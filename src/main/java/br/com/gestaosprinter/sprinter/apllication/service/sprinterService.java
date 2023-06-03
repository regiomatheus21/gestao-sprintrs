package br.com.gestaosprinter.sprinter.apllication.service;
import br.com.gestaosprinter.sprinter.apllication.api.*;

import java.util.List;
import java.util.UUID;

public interface sprinterService {
    SprinterResponse criaSprinter(SprinterRequest sprinterRequest);

    List<SprinterListResponse> buscaTodosSprinters();

    SprinterDetalhadoResponse buscaSprinterAtravesId(UUID idSprinter);

    void deletaSprinterAtravesId(UUID idSprinter);
}
