package kassandrafalsitta.u2w3d3;

import kassandrafalsitta.u2w3d3.es1.Adapter.InfoAdapter;
import kassandrafalsitta.u2w3d3.es1.Adapter.entities.Info;
import kassandrafalsitta.u2w3d3.es1.Adapter.entities.UserData;
import kassandrafalsitta.u2w3d3.es1.Adapter.interfaces.DataSource;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class U2w3d3Application {

    public static void main(String[] args) {

        System.out.println("-------------------------esercizio 1---------------------------------");
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        Date dataNascita = new Date(90, 2, 1);
        info.setDataDiNascita(dataNascita);

        DataSource adapter = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(adapter);
        System.out.println("Nome completo: " + adapter.getNomeCompleto());
        System.out.println("Età: " + adapter.getEta());
        System.out.println("-------------------------esercizio 2---------------------------------");

    }


}
