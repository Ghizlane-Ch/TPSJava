package cigma.pfe.Controllers;

import cigma.pfe.Models.Client;
import cigma.pfe.Models.Facture;

import cigma.pfe.services.IClientService;
import cigma.pfe.services.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("ctrl2")
public class FactureController {

    @Autowired
   private IFactureService factureService ;

    public FactureController(){System.out.println("creation bean controller2");}

    public FactureController (IFactureService factureService) {
        System.out.println("Call FactureController with facture Service param....");
        this.factureService = factureService;
    }

    public void create(Facture f) {
        System.out.println("FactureController level...");
        factureService.create(f);
    }
    public void update(Facture f) {
        System.out.println("FactureController level...");
        factureService.update(f);
    }
    public void delete(Facture f) {
        System.out.println("FactureController level...");
        factureService.delete(f);
    }
    public Facture read(Facture f){
        return factureService.read(f);
    }
}
