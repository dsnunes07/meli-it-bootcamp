package meli.bootcamp.aula5.exe1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("1", "a");
        Pessoa p2 = new Pessoa("2", "b");
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
    }
}
