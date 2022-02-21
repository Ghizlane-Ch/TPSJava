package cigma.pfe.services;

import cigma.pfe.Models.Client;
import cigma.pfe.Dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service

@Transactional
public class ClientServiceImpl implements IClientService{

    @Autowired
    private ClientDao clientDao;

    public ClientServiceImpl (){System.out.println("creation bean service");
    }

    @Override
    public void save(Client c) {
        clientDao.save(c);
    }

    @Override
    public Client update(Client c) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Client getById(long id) {
        return null;
    }

    @Override
    public List<Client> getAll() {
        return null;
    }


}
