package cigma.pfe.Dao;

import cigma.pfe.Models.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientDaoImpl implements ClientDao {

    @PersistenceContext
    EntityManager em ;

    public ClientDaoImpl() {System.out.println("creation bean dao");
    }

    @Override
    public Client save(Client c) {
        em.persist(c);
        return null;
    }

    @Override
    public Client update(Client c) {
        Client currentClient = em.find(Client.class, c.getId());
        currentClient.setName(c.getName());
        em.persist(currentClient);
        return null;
    }

    @Override
    public void deleteById(long id) {
        Client clientInDataBase = em.find(Client.class, id);
        em.remove(clientInDataBase);

    }

    @Override
    public Client findById(long id) {
        return em.find(Client.class, id);
    }

    @Override
    public List<Client> findAll() {
        Query query = em.createQuery("SELECT u FROM unit_clients u", Client.class);
        return (List<Client>) query.getResultList();
    }

    private List<Client> clientDao = new ArrayList<>();



}
