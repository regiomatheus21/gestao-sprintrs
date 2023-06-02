package br.com.gestaosprinter.sprinter.apllication.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;
import br.com.gestaosprinter.sprinter.apllication.service.sprinterService;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class SprinterController implements SprinterApi {
    private final sprinterService sprinterService;
    @Override
    public SprinterResponse postSprinter(SprinterRequest sprinterRequest) {
        log.info("[inicia] SprinterController - postSprinter ");
        SprinterResponse sprintCriado = sprinterService.criaSprinter(sprinterRequest);
        log.info("[finaliza] SprinterController - postSprinter ");
        return sprintCriado;
    }

    @Override
    public List<SprinterListResponse> getTodosSprinter() {
        log.info("[inicia] SprinterController - getTodosSprinter ");
        log.info("[finaliza] SprinterController - getTodosSprinter ");
        return null;
    }
}
