package cigma.pfe.Models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity(name = "TClients")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return this.id;
    }

    /**** Factures **/
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private List<Facture> factures;

    /***Promotions***/
    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(name = "client_fk", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "promotion_fk", referencedColumnName = "id"))
    private List<Promotion> promotions;

    /****Carte Fidelio **/
    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private CarteFidelio carteFidelio;

    /** Adresse **/
    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private Adresse adresse;

    public Client() {}

    public Client(String name) {
        this.name = name;
    }

    @Column
    private String name;

}

