package br.com.gestaosprinter.sprinter.apllication.repository;

import br.com.gestaosprinter.sprinter.domain.Sprinter;

import java.util.List;

public interface SprinterRepository {

     List<Sprinter> buscaTodosSprinters();

     Sprinter salva(Sprinter sprinter);
}
