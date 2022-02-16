package cigma.pfe.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@Entity(name = "TCarteF")
@ToString
    public class CarteFidelio {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        private String code;

        @OneToOne
        @JoinColumn(name = "client_id")
        private Client client;

        public CarteFidelio(String code) {
        this.code = code;
    }


}
