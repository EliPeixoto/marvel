package herois.marvel.controller;

import herois.marvel.herois.DadosCadastroHerois;
import herois.marvel.herois.Herois;
import herois.marvel.repository.HeroisRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("herois")
public class HeroisController {

    @Autowired
    private HeroisRepository repository;

    @PostMapping
    public void cadastrar(@Valid @RequestBody DadosCadastroHerois dados){
       repository.save(new Herois(dados));
    }

}
