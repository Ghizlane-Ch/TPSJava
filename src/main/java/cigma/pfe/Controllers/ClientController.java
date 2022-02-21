package cigma.pfe.Controllers;

import cigma.pfe.Models.Client;
import cigma.pfe.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller("ctrl1")
public class ClientController {

    @Autowired
    private IClientService clientService;

    public ClientController(){System.out.println("creation bean controller");}

    public ClientController(IClientService clientService) {
        System.out.println("Call ClientController with client Service param....");
        this.clientService = clientService;
    }

    public void save(Client c) {
        System.out.println("ClientController level...");
        clientService.save(c);
    }

    public void update(Client c) {
        System.out.println("ClientController level...");
        clientService.update(c);
    }

    public void deleteById(long id) {
        System.out.println("ClientController level...");
        clientService.deleteById(id);
    }

    public Client findById(long id) {
        return clientService.findById(id);
    }

    private List<Client> clientsService = new ArrayList<>();

    public List<Client> findAll() {
        return ((IClientService) clientsService).findAll();
    }

}
