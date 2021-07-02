package meli.bootcamp.spring.starwars.business;

import meli.bootcamp.spring.starwars.domain.StarWarsCharacter;
import meli.bootcamp.spring.starwars.repository.StarWarsCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarWarsCharacterBusiness {
    @Autowired
    private StarWarsCharacterRepository repository;

    public List<StarWarsCharacter> getNameLike(String name) {
        return repository.getNameLike(name);
    }
}
