package cigma.pfe.Controllers;


import cigma.pfe.Models.Facture;

import cigma.pfe.services.IFactureService;

import java.util.List;

public class FactureController {
    public FactureController(IFactureService factureService) {
        this.factureService = factureService;
    }

    public IFactureService getFactureService() {
        return factureService;
    }

    public FactureController(){}

    IFactureService factureService ;

    public void setFactureService(IFactureService factureService) {
        this.factureService = factureService;
    }

    public Facture save(Facture f){
        System.out.println("ClientController level...");
        return factureService.save(f);
    }
    public void update(Facture f){
        factureService.update(f);
    }

    //public IFactureService getFactureService() {return FactureService;}

    public void deleteById(long id){
        factureService.deleteById(id);
    }
    public Facture getById(long id){
        return factureService.getById(id);
    }

    public List<Facture> getAll(){return  factureService.getAll();}
}
