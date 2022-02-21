package cigma.pfe.Dao;
import cigma.pfe.Models.Client;

import java.util.List;

public interface ClientDao {

        Client save(Client c);
        Client update(Client c);
        void deleteById(long id);
        Client findById(long id);
        List<Client> findAll();

}
