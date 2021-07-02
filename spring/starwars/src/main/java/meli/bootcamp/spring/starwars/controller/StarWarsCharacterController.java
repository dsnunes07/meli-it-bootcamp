package meli.bootcamp.spring.starwars.controller;

import meli.bootcamp.spring.starwars.business.StarWarsCharacterBusiness;
import meli.bootcamp.spring.starwars.domain.StarWarsCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/star-wars")
public class StarWarsCharacterController {

    @Autowired
    private StarWarsCharacterBusiness business;

    @GetMapping("/search")
    @ResponseStatus(value = HttpStatus.OK)
    public List<StarWarsCharacter> getNameLike(@RequestParam String name) {
        return business.getNameLike(name);
    }
}
