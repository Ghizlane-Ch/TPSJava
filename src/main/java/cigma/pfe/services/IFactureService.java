package cigma.pfe.services;

import cigma.pfe.Models.Facture;

public interface IFactureService {

    Facture create(Facture f);

    Facture read(Facture f);

    Facture update(Facture f);


    void delete(Facture f);
}
