package cigma.pfe.Dao;

import cigma.pfe.Models.Client;
import cigma.pfe.Models.Facture;

import java.util.List;

public interface FactureDao {

    Facture save(Facture f);
    Facture update(Facture fact);
    void deleteById(long idFacture);
    Facture findById(long idFacture);
    List<Facture> findALL();

    List<Facture> findAll();
}
