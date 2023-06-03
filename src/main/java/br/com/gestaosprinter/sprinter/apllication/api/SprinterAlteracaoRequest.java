package br.com.gestaosprinter.sprinter.apllication.api;

import br.com.gestaosprinter.sprinter.domain.Sexo;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Value
public class SprinterAlteracaoRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String celular;
    private Sexo sexo;
    private String cpf;
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    private Boolean aceitaTermos;
}
