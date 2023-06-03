package br.com.gestaosprinter.sprinter.apllication.repository;

import br.com.gestaosprinter.sprinter.domain.Sprinter;

import java.util.List;
import java.util.UUID;

public interface SprinterRepository {

     List<Sprinter> buscaTodosSprinters();

     Sprinter salva(Sprinter sprinter);

     Sprinter buscaSprinterAtravesId(UUID idSprinter);

     void deletaSprinter(Sprinter sprinter);
}
