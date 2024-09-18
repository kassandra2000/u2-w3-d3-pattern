package kassandrafalsitta.u2w3d3.es1.Adapter.entities;

import kassandrafalsitta.u2w3d3.es1.Adapter.interfaces.DataSource;

public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
