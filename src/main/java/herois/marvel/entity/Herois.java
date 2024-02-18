package herois.marvel.entity;

import herois.marvel.endereco.DadosEndereco;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name="herois")
public class Herois {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long Id;
    String nome;
    String email;
    String crh; // **Cadastro Regional de Herois

     Especialidade especialidade;


    DadosEndereco endereco;
}
