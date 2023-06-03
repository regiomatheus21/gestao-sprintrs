package br.com.gestaosprinter.sprinter.apllication.api;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/sprinter")
public interface SprinterApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    SprinterResponse postSprinter (@Valid @RequestBody SprinterRequest sprinterRequest);
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<SprinterListResponse> getTodosSprinter();

    @GetMapping(value = "/{idSprinter}")
    @ResponseStatus(code = HttpStatus.OK)
    List<SprinterDetalhadoResponse> getSprinterAtravesId();


}
