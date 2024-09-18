package kassandrafalsitta.u2w3d3.es2.entities;

import kassandrafalsitta.u2w3d3.es2.interfaces.ComponenteLibro;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pagina implements ComponenteLibro {
    private int numeroPagina;


    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina numero: " + numeroPagina);
    }
}
