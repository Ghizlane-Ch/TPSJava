package cigma.pfe.Controllers;

import cigma.pfe.Models.Client;
import cigma.pfe.services.IClientService;

import java.util.List;

public class ClientController {

        IClientService  clientService ;

    public void setClientService(IClientService clientService) {
        this.clientService = clientService;
    }

    public Client save(Client c ){
            System.out.println("ClientController level...");
            return clientService.save(c);
        }
    public void update(Client c){
        clientService.update(c);
    }

    //public IClientService getClientService() {return clientService;}

    public void deleteById(long id){
        clientService.deleteById(id);
    }
    public Client getById(long id){
        return clientService.getById(id);
    }

    public List<Client> getAll(){return  clientService.getAll();}

}
