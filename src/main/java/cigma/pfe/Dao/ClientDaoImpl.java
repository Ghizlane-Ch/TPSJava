package cigma.pfe.Dao;


import cigma.pfe.Models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;


public class ClientDaoImpl implements ClientDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em = emf.createEntityManager();

   /* private ClientDao dao;

    public void setDao(ClientDao dao) {
        this.dao = dao;
    }*/

    public ClientDaoImpl() {
    }

    @Override
    public Client save(Client c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Client update(Client newClt) {
        em.getTransaction().begin();
        Client currentClient = em.find(Client.class, newClt.getId());
        currentClient.setName(newClt.getName());
        em.persist(currentClient);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public void deleteById(long idClient) {
        em.getTransaction().begin();
        Client clientInDataBase = em.find(Client.class, idClient);
        em.remove(clientInDataBase);
        em.getTransaction().commit();
    }

    @Override
    public Client findById(long idClient) {
        return em.find(Client.class,idClient);
    }

    @Override
    public List<Client> findALL() {
        Query query = em.createQuery("select c from Client c");
        return query.getResultList();
    }
}
