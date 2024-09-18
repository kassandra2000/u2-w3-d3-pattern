package kassandrafalsitta.u2w3d3.es3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Ufficiale {
    protected Ufficiale superiore;
    private double stipendio;

    public void doCheck(double stipendioMinimo) {
        if (stipendioMinimo <= this.stipendio)
            System.out.println("Lo stipendio di " + this.getClass().getSimpleName() + " è di " + this.getStipendio() + " ed è maggiore di " + stipendioMinimo);
        if (superiore != null) {
            this.superiore.doCheck(stipendioMinimo);
        } else {
            System.out.println("Non ci sono altri ufficiali di grado superiore");
        }
    }

    ;


}
