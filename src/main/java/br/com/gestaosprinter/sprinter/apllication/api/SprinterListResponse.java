package br.com.gestaosprinter.sprinter.apllication.api;

import br.com.gestaosprinter.sprinter.domain.Sexo;
import br.com.gestaosprinter.sprinter.domain.Sprinter;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class SprinterListResponse {
    private UUID idSprinter;
    private String nome;
    private String cpf;
    private String email;
    private String celular;


    public static List<SprinterListResponse> converte(List<Sprinter> sprinters){
        return sprinters.stream()
                .map(SprinterListResponse :: new)
                .collect(Collectors.toList());
    }
    private SprinterListResponse (Sprinter sprinter){
        super();
        this.idSprinter=sprinter.getIdSprinter();
        this.nome = sprinter.getNome();
        this.cpf = sprinter.getCpf();
        this.email = sprinter.getEmail();
        this.celular = sprinter.getCelular();
    }
}
