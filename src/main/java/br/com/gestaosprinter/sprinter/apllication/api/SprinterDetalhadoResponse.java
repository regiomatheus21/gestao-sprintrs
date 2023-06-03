package br.com.gestaosprinter.sprinter.apllication.api;

import br.com.gestaosprinter.sprinter.domain.Sexo;
import br.com.gestaosprinter.sprinter.domain.Sprinter;

import java.time.LocalDateTime;
import java.util.UUID;

public class SprinterDetalhadoResponse {
    private UUID idSprinter;
    private String nome;
    private String cpf;
    private String celular;
    private String email;
    private boolean aceitaTermos;
    private LocalDateTime dataHoraDoCadastro;
    private Sexo sexo;

    public SprinterDetalhadoResponse (Sprinter sprinter){
        this.idSprinter = sprinter.getIdSprinter();
        this.nome = sprinter.getNome();
        this.cpf = sprinter.getCpf();
        this.email =sprinter.getEmail();
        this.celular = sprinter.getCelular();
        this.sexo = sprinter.getSexo();
        this.aceitaTermos = sprinter.getAceitaTermos();
        this.dataHoraDoCadastro = sprinter.getDataHoraDoCadastro();
    }
}
