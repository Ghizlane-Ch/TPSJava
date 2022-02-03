package cigma.pfe.services;
import cigma.pfe.Models.Client;

import java.util.List;

public interface IClientService {

    Client save(Client c);
    Client update(Client c);
    void deleteById(long id);

    Client getById(long id);

    List<Client> getAll();
}
