package herois.marvel.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("herois")
public class HeroisController {

    @PostMapping
    public void cadastrar(){

    }

}
