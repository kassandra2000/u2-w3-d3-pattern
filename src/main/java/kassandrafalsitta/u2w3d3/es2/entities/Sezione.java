package kassandrafalsitta.u2w3d3.es2.entities;

import kassandrafalsitta.u2w3d3.es2.interfaces.ComponenteLibro;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Sezione implements ComponenteLibro {
    private String titolo;
    private List<ComponenteLibro> sottoElementi = new ArrayList<>();

    public void aggiungiElemento(ComponenteLibro elemento) {
        sottoElementi.add(elemento);
    }

    @Override
    public int getNumeroPagine() {
        int totalePagine = 0;
        for (ComponenteLibro elemento : sottoElementi) {
            totalePagine += elemento.getNumeroPagine();
        }
        return totalePagine;
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (ComponenteLibro elemento : sottoElementi) {
            elemento.stampa();
        }
    }
}
