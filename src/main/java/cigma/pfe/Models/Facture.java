package cigma.pfe.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "TFactures")
@ToString
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double amount;
    private String description;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name="my_join_table_facture_product",joinColumns = @JoinColumn(name = "facture_fk", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "product_fk", referencedColumnName = "id"))
    private List<Produit> products;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Facture() {}

    public Facture(double amount, String description, Client client) {

        this.amount = amount;
        this.description = description;
        this.client = client;
    }
    public Facture(double amount, String description) {

        this.amount = amount;
        this.description = description;

    }

    public double getAmount() {
            return amount;
        }

    public String getName() {
            return getName();
    }
}
