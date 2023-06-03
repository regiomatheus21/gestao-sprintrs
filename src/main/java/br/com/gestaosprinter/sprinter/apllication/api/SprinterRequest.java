package br.com.gestaosprinter.sprinter.apllication.api;

import br.com.gestaosprinter.sprinter.domain.Sexo;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Value
public class SprinterRequest {
    @NotBlank
    private String nome;
    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String celular;
    @CPF
    private String cpf;

    private Sexo sexo;
    @NotNull
    private LocalDate dataNascimento;

    private boolean aceitaTermos;

}
