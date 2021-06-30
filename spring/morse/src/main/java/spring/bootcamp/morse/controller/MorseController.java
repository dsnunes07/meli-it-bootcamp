package spring.bootcamp.morse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.bootcamp.morse.model.Morse;

import java.util.Locale;

@RestController
public class MorseController {
    @GetMapping(path = "/translate/{morse}")
    public String translateMessage(@PathVariable String morse) {
        Morse m = new Morse(morse);
        return m.translate();
    }
}
