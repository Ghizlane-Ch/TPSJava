package cigma.pfe.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "TAdresse")
@ToString

public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    String avenue;
    String ville;
    String pays;

    public Adresse(String avenue) {
        this.avenue=avenue;
    }

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
