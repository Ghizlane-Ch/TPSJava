package cigma.pfe.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString

    public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name="my_join_table_promotion_client",joinColumns = @JoinColumn(name = "promotion_fk", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "client_fk", referencedColumnName = "id"))
    private List<Client> clientL;

    private Client client;

    public Promotion(String description, Client client) {
        this.description = description;
        this.client=client;
    }

}
