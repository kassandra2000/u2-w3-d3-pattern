package kassandrafalsitta.u2w3d3.es1.Adapter;

import kassandrafalsitta.u2w3d3.es1.entities.Info;
import kassandrafalsitta.u2w3d3.es1.interfaces.DataSource;
import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class InfoAdapter implements DataSource {
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Date dataDiNascita = info.getDataDiNascita();
        Date oggi = new Date();
        int annoNascita = dataDiNascita.getYear();
        int annoCorrente = oggi.getYear();
        return annoCorrente - annoNascita;
    }
}
