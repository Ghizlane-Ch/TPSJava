package cigma.pfe.services;

import cigma.pfe.Models.Client;
import cigma.pfe.Dao.ClientDao;

import java.util.List;

public class ClientServiceImpl implements IClientService{

    ClientDao clientDao;
    public ClientServiceImpl(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientDao.save(c);
    }
    @Override
    public Client update(Client c) {
        return clientDao.update(c);
    }

    @Override
    public void deleteById(long id) {
        clientDao.deleteById(id);
    }

    @Override
    public Client getById(long id) { return clientDao.findById(id);}

    @Override
    public List<Client> getAll() {return clientDao.findALL();}
}
