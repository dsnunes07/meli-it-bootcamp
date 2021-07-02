package meli.bootcamp.spring.starwars.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import meli.bootcamp.spring.starwars.domain.StarWarsCharacter;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StarWarsCharacterRepository {
    private final String CHARACTERS_FILENAME = "starwars.json";

    public List<StarWarsCharacter> getNameLike(String name) {
        List<StarWarsCharacter> characters = this.readFile();
        return characters.stream().filter((character) -> character.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }

    private List<StarWarsCharacter> readFile() {
        List<StarWarsCharacter> characters = null;
        try {
            File file = this.loadFile(CHARACTERS_FILENAME);
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<StarWarsCharacter>> typeRef = new TypeReference<List<StarWarsCharacter>>() {};
            characters = mapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return characters;
    }

    private File loadFile(String filename) throws FileNotFoundException {
        File file = null;
        file = ResourceUtils.getFile("classpath:"+filename);
        return file;
    }
}
