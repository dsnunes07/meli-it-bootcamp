package spring.bootcamp.morse.controller;

import org.springframework.web.bind.annotation.*;
import spring.bootcamp.morse.model.Morse;

import java.util.Locale;

@RestController
public class MorseController {
    @RequestMapping("/translate")
    public String translateMessage(@RequestParam String message) {
        Morse m = new Morse(message);
        return m.translate();
    }
}
