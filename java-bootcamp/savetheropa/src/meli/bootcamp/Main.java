package meli.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    GuardaRoupa gr = new GuardaRoupa();
	    List<Vestuario> v = new ArrayList<>();
	    v.add(new Vestuario("Adidas", "Star"));
	    v.add(new Vestuario("Nike", "Total90"));
	    v.add(new Vestuario("Conga", "1974"));
	    int pos = gr.guardarVestuarios(v);
	    gr.mostrarVestuarios();
        System.out.println(gr.devolveVestuarios(pos));
    }
}
