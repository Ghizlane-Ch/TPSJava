package cigma.pfe.Dao;

import cigma.pfe.Models.Facture;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class FactureDaolmpl implements FactureDao {

    private FactureDao factureDao;

    @PersistenceContext
    EntityManager emm;

    public void setFactureDao(FactureDao factureDao) {
        this.factureDao = factureDao;
    }

    @Override
    public Facture create(Facture f) {
        emm.persist(f);
        return null;
    }

    @Override
    public Facture read(Facture f) {
        return emm.find(Facture.class,f.getId());
    }

    @Override
    public Facture save(Facture f) {
        return null;
    }

    @Override
    public Facture update(Facture f) {
        Facture currentFacture =emm.find(Facture.class,f.getId());
        currentFacture.setDescription(f.getDescription());
        emm.persist(currentFacture);
        return null;
    }

    @Override
    public void delete(Facture f) {
        Facture factureInDataBase = emm.find(Facture.class,f.getId());
        emm.remove(factureInDataBase);


    }
    }
