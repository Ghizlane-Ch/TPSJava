package cigma.pfe.Dao;

import cigma.pfe.Models.Client;
import cigma.pfe.Models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class FactureDaolmpl implements FactureDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em = emf.createEntityManager();

    public FactureDaolmpl() {
    }

    @Override
    public Facture save(Facture f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Facture update(Facture fact) {
        em.getTransaction().begin();
        Client currentClient = em.find(Client.class, fact.getId());
        currentClient.setName(fact.getName());
        em.persist(currentClient);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public void deleteById(long idFacture) {
        em.getTransaction().begin();
        Facture factureInDB = em.find(Facture.class, idFacture);
        em.remove(factureInDB);
        em.getTransaction().commit();
    }
    @Override
    public Facture findById(long idFacture) {
        return em.find(Facture.class,idFacture);
    }


    @Override
    public List<Facture> findAll() {
        Query query = em.createQuery("select f from TFactures f",Facture.class);
        return query.getResultList();
    }
}
