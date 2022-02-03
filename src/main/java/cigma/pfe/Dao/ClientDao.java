package cigma.pfe.Dao;
import cigma.pfe.Models.Client;


import java.util.List;

public interface ClientDao {

        Client save(Client c);
        Client update(Client c);
        void deleteById(long idClient);
        Client findById(long idClient);


        List<Client> findALL();

}
