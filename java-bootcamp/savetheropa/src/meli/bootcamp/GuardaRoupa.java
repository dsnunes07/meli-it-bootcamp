package meli.bootcamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {
    private HashMap<Integer, List<Vestuario>> roupas;
    private static Integer contador = 0;

    public GuardaRoupa() {
        roupas = new HashMap<>();
    }

    public int guardarVestuarios(List<Vestuario> v) {
        this.roupas.put(++contador, v);
        return contador;
    }

    public void mostrarVestuarios() {
        this.roupas.forEach((key, vestuarios) -> this.printListVestuarios(key, vestuarios));
    }

    public List<Vestuario> devolveVestuarios(Integer i) {
        return roupas.get(i);
    }

    private void printListVestuarios(Integer key, List<Vestuario> vestuarios) {
        for (Vestuario v : vestuarios) {
            System.out.println(key + ": " + v);
        }
    }
}
