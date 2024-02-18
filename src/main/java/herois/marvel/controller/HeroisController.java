package herois.marvel.controller;

import herois.marvel.herois.DadosCadastroHerois;
import herois.marvel.herois.DadosListagemHerois;
import herois.marvel.herois.Herois;
import herois.marvel.repository.HeroisRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("herois")
public class HeroisController {

    @Autowired
    private HeroisRepository repository;


    @GetMapping
    public Page<DadosListagemHerois> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemHerois::new);
    }

    @PostMapping
    public void cadastrar(@Valid @RequestBody DadosCadastroHerois dados) {
        repository.save(new Herois(dados));
    }

}
