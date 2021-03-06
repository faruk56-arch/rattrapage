import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Herited from Vegetal
public class Fruits extends Vegetal {

    public Fruits(String nom, LocalDate dateLimiteConsommation, int stock,
            Color color, Categorie categorie) {
        super(nom, dateLimiteConsommation, stock, categorie, color);

    }

    @Override
    public String toString() {
        return nom + "  " + stock + "kg en stock , périme dans "
                + ChronoUnit.DAYS.between(LocalDate.now(), dateLimiteConsommation) + " " + " jours " + " | ";
    }

}
