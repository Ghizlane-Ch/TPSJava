package cigma.pfe.services;

import cigma.pfe.Dao.FactureDao;
import cigma.pfe.Models.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FactureServicelmpl implements IFactureService{

    @Autowired
    private FactureDao factureDao;

    public void FactureServiceImpl() {
        System.out.println("CallFactureServiceImpl ....");
    }

    public void FactureServiceImpl(FactureDao factureRepository) {
        System.out.println("Call FactureService with facture Dao param....");
        this.factureDao = factureRepository;
    }

    @Override
    public Facture create(Facture f) {
        return factureDao.create(f);
    }

    @Override
    public Facture read(Facture f) {
        return factureDao.read(f);
    }

    @Override
    public Facture update(Facture f) {
        return factureDao.update(f);
    }

    @Override
    public void delete(Facture f) {
        factureDao.delete(f);

    }

}
