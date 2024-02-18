package herois.marvel.entity;

import herois.marvel.endereco.DadosEndereco;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "herois")
public class Herois {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long Id;

    @NotBlank
    String nome;

    @NotBlank
    @Email
    String email;

    @NotBlank
    String crh; // **Cadastro Regional de Herois

    @NotBlank
    Especialidade especialidade;


   /* DadosEndereco endereco;*/
}
