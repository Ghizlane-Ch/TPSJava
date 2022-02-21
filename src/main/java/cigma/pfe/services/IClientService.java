package cigma.pfe.services;
import cigma.pfe.Models.Client;

import java.util.List;

public interface IClientService {

    void save(Client c);
    Client update(Client c);
    void deleteById(long id);

    Client getById(long id);

    List<Client> getAll();

    Client findById(long id);

    List<Client> findAll();
}
