package br.com.gestaosprinter.sprinter.domain;

import br.com.gestaosprinter.sprinter.apllication.api.SprinterAlteracaoRequest;
import br.com.gestaosprinter.sprinter.apllication.api.SprinterRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Sprinter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid",name = "id",updatable = false,unique = true,nullable = false)
    private UUID idSprinter;
    @NotBlank
    private String nome;
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
    @NotBlank
    private String celular;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @NotNull
    private LocalDate dataNascimento;
    @CPF
    @Column(unique = true)
    private String cpf;
    @NotNull
    private Boolean aceitaTermos;
    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

    public Sprinter(SprinterRequest sprinterRequest){
        this.nome=sprinterRequest.getNome();
        this.cpf= sprinterRequest.getCpf();
        this.celular= sprinterRequest.getCelular();
        this.email= sprinterRequest.getEmail();
        this.sexo = sprinterRequest.getSexo();
        this.dataNascimento= sprinterRequest.getDataNascimento();
        this.aceitaTermos = sprinterRequest.isAceitaTermos();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }

    public void altera(SprinterAlteracaoRequest sprinterAlteracaoRequest) {
        this.nome = sprinterAlteracaoRequest.getNome();
        this.celular= sprinterAlteracaoRequest.getCelular();
        this.sexo = sprinterAlteracaoRequest.getSexo();
        this.dataNascimento = sprinterAlteracaoRequest.getDataNascimento();
        this.aceitaTermos = sprinterAlteracaoRequest.getAceitaTermos();
        this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
        this.cpf = sprinterAlteracaoRequest.getCpf();
    }
}
