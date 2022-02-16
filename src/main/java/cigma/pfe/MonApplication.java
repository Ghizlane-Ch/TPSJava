package cigma.pfe;

import cigma.pfe.Controllers.ClientController;

import cigma.pfe.Controllers.FactureController;
import cigma.pfe.Models.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class MonApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController)context.getBean("controller");
        FactureController Factur = (FactureController) context.getBean("controllerF");

        Client clt = new Client("OMAR");


        // Test save use case for three clients

        //  ctrl.save(new Client("OMAR"));
        //ctrl.save(new Client("SIHAM"));
        //ctrl.save(new Client("AHMED"));
        //ctrl.save(new Client("FARAH"));

        // Test modify use case for client with id==1
        // ctrl.update(new Client(1,"new Name"));
        // Test remove use case for client with id==1

        //ctrl.deleteById(2);
        // Test find use case for client with id==1
        Client found = ctrl.getById(1);
        System.out.println("VOILA GET BY ID :"+found.getName());
        // Test find all use case
        System.out.println("\n\n\n********list client*********\n\n\n");
        List<Client> clients = ctrl.getAll();
        for(Client c: clients)
            System.out.println("Client name => " + c.getName());

        // Test save use case for two invoices
        ctrl.save(clt);
        Factur.save(new Facture(424.2, "desc",clt));
        Factur.save(new Facture(32.23, "desc44",clt));

        // Test modify use case for invoice with id==1
        //Factur.update(new Facture(1, "des66",clt));


        // Test remove use case for invoice with id==1
        //Factur.deleteById(3);

        // Test find use case for invoice with id==2
        Facture facture = Factur.getById(5);
        System.out.println("invoice info de 5 => " + facture.getAmount() +" "+ facture.getDescription());

        // Test find all use case
        List<Facture> invoices = Factur.getAll();

        for(Facture ftr : invoices)
            System.out.println("invoice info => " + ftr.getAmount() +" "+ ftr.getDescription());

        context.close();

        /*ajouter un client avec son facture*/
        Client client = ctrl.getById(5);

        List<Facture> factures = Arrays.asList(new Facture(1500.0,"facture1",client),
                new Facture(2000.0,"facture2",client));
        client.setFactures(factures);
        ctrl.save(client);

        //ajouter promotion
        Client cl = ctrl.getById(5);
        List<Promotion> promotions=Arrays.asList(new Promotion("remise  10%",cl),
                new Promotion("solde 40%",cl));
        cl.setPromotions(promotions);
        ctrl.save(client);

        /* ***Ajouter carte fidelio*** */
        CarteFidelio carteFidelio = new CarteFidelio("A29930489");
        carteFidelio.setClient(client);
        client.setCarteFidelio(carteFidelio);
        ctrl.save(client);

        /* ***Ajouter une adresse*** */
        Adresse ad = new Adresse("avneue 23");
        ad.setClient(client);
        client.setAdresse(ad);
        ctrl.save(client);

    }
}


