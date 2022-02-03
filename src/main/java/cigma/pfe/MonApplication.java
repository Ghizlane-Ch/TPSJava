package cigma.pfe;

import cigma.pfe.Controllers.ClientController;

import cigma.pfe.Controllers.FactureController;
import cigma.pfe.Models.Client;
import cigma.pfe.Models.Facture;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MonApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController)context.getBean("controller");
        FactureController Factur = (FactureController) context.getBean("controllerF");

        Client clt = new Client("OMAR");

        //ctrl.save(clt);
        // Test save use case for three clients

        /*  ctrl.save(new Client("OMAR"));
        ctrl.save(new Client("SIHAM"));
        ctrl.save(new Client("AHMED"));
        ctrl.save(new Client("FARAH"));*/

// Test modify use case for client with id==1
        // ctrl.update(new Client(1,"new Name"));
// Test remove use case for client with id==1

        //ctrl.deleteById(2);
// Test find use case for client with id==1
        Client found = ctrl.getById(1);
        System.out.println(""+found.getName());
        // Test find all use case
        System.out.println("\n\n\n********list client*********\n\n\n");
        List<Client> clients = ctrl.getAll();
        for(Client c: clients)
            System.out.println("Client name => " + c.getName());

        // Test save use case for two invoices
        Factur.save(new Facture(42444, 2/4/2021));
        Factur.save(new Facture(32234, 23/4/2021));

        // Test modify use case for invoice with id==1
        Factur.update(new Facture(1, 12/2/2012, 2343));

        // Test remove use case for invoice with id==1
        Factur.deleteById(1);

        // Test find use case for invoice with id==2
        Facture facture = Factur.getById(3);
        System.out.println("invoice info => " + facture.getAmount() +" "+ facture.getDescription());

        // Test find all use case
        List<Facture> invoices = Factur.getAll();

        for(Facture ftr : invoices)
            System.out.println("invoice info => " + ftr.getAmount() +" "+ ftr.getDescription());

        context.close();
    }
}


