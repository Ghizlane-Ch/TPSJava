package cigma.pfe.services;

import cigma.pfe.Models.Facture;

import java.util.List;

public interface IFactureService {
    Facture save(Facture f);

    Facture update(Facture f);

    void deleteById(long id);

    Facture getById(long id);

    List<Facture> getAll();
}
