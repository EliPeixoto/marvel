package herois.marvel.herois;

import herois.marvel.endereco.DadosEndereco;
import herois.marvel.endereco.Endereco;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "herois")
@Entity(name = "Marvel")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Herois {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String crh; // **Cadastro Regional de Herois

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    @Valid
    private Endereco endereco;


    public Herois(DadosCadastroHerois dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crh = dados.crh();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());

    }
}
