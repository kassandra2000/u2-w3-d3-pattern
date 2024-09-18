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
public class Libro implements ComponenteLibro {
    private String titolo;
    private List<String> autori;
    private double prezzo;
    private List<Sezione> sezioneList = new ArrayList<>();

    public void aggiungiElemento(Sezione elemento) {
        sezioneList.add(elemento);
    }

    @Override
    public int getNumeroPagine() {
        int numeroPagine = 0;
        for (Sezione sezione : sezioneList) {
            numeroPagine += sezione.getNumeroPagine();
        }
        return numeroPagine;
    }

    @Override
    public void stampa() {
        for (Sezione sezione : sezioneList) {
            System.out.println("Titolo del libro: " + titolo);
            System.out.println("Autori: " + String.join(", ", autori));
            System.out.println("Prezzo: " + prezzo + "€");
            sezione.stampa();
        }
    }
}
