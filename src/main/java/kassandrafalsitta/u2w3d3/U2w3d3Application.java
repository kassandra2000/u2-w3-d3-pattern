package kassandrafalsitta.u2w3d3;

import kassandrafalsitta.u2w3d3.es1.Adapter.InfoAdapter;
import kassandrafalsitta.u2w3d3.es1.entities.Info;
import kassandrafalsitta.u2w3d3.es1.entities.UserData;
import kassandrafalsitta.u2w3d3.es1.interfaces.DataSource;
import kassandrafalsitta.u2w3d3.es2.entities.Libro;
import kassandrafalsitta.u2w3d3.es2.entities.Pagina;
import kassandrafalsitta.u2w3d3.es2.entities.Sezione;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
        Pagina pagina = new Pagina(1);
        Pagina pagina2 = new Pagina(2);
        Pagina pagina3 = new Pagina(3);

        Sezione sezione = new Sezione("sottoCapitolo 1", Arrays.asList(pagina, pagina2, pagina3));
        Sezione sezione2 = new Sezione("capitolo 1", List.of(sezione));

        Libro libro = new Libro("Design Patterns", List.of("Gamma", "Helm", "Johnson", "Vlissides"), 49.99, List.of(sezione2));
        libro.stampa();
        System.out.println("numero di pagine totali: " + libro.getNumeroPagine());
        System.out.println("-------------------------esercizio 3---------------------------------");


    }


}
