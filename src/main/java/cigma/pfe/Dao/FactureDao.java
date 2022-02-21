package cigma.pfe.Dao;

import cigma.pfe.Models.Facture;


public interface FactureDao {

    Facture create(Facture f);
    Facture read(Facture f);

    Facture save(Facture f);

    Facture update(Facture f);
    void delete(Facture f);
}
