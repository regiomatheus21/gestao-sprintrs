package br.com.gestaosprinter.sprinter.apllication.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;
@Value
@Builder
public class SprinterResponse {
    private UUID idSprinter;


}
