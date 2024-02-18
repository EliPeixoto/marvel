package herois.marvel.controller;

import herois.marvel.herois.DadosCadastroHerois;
import herois.marvel.herois.DadosListagemHerois;
import herois.marvel.herois.Herois;
import herois.marvel.repository.HeroisRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("herois")
public class HeroisController {

    @Autowired
    private HeroisRepository repository;


    @GetMapping
    public List<DadosListagemHerois> listar() {
        return repository.findAll().stream().map(DadosListagemHerois::new).toList();
    }

    @PostMapping
    public void cadastrar(@Valid @RequestBody DadosCadastroHerois dados) {
        repository.save(new Herois(dados));
    }

}
