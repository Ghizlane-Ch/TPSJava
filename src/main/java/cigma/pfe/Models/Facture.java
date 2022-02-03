package cigma.pfe.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "TFactures")
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int date;
    private double amount;

    public Facture(double amount, int date) {
        this.amount = amount;
        this.date= date;
    }

    public String getName() {
        return getName();
    }

    public String getDescription() {
        return getDescription();
    }
}
