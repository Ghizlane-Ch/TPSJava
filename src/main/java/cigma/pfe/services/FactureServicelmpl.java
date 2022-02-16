package cigma.pfe.services;

import cigma.pfe.Dao.FactureDao;
import cigma.pfe.Models.Facture;

import java.util.List;

public class FactureServicelmpl implements IFactureService{

    FactureDao factureDao;
    public FactureServicelmpl(FactureDao factureDao) {
        this.factureDao = factureDao;
    }

    public FactureDao getFactureDao() {
        return factureDao;
    }

    public void setFactureDao(FactureDao factureDao) {
        this.factureDao = factureDao;
    }

    public FactureServicelmpl(){}
    @Override
    public Facture save(Facture f) {
        System.out.println("Service Layer : FactureServicelmpl Level... ");
        return factureDao.save(f);}

    @Override
    public Facture update(Facture f) { return factureDao.update(f);}

    @Override
    public void deleteById(long id){ factureDao.deleteById(id);}

    @Override
    public Facture getById(long id) { return factureDao.findById(id);}

    @Override
    public List<Facture> getAll() {return factureDao.findAll();}
}
