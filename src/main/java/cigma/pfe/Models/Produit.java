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
@Entity(name = "TProduit")
@ToString
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    String name;
    double price;


    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name="my_join_table_product_facture",joinColumns = @JoinColumn(name = "product_fk", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "facture_fk", referencedColumnName = "id"))
    private List<Facture> factures;
}
