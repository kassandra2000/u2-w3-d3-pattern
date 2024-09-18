package kassandrafalsitta.u2w3d3.es3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tenente extends Ufficiale {
    public Tenente() {
        this.setStipendio(1000);
    }

}
