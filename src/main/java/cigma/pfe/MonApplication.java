package cigma.pfe;

import cigma.pfe.Controllers.ClientController;

import cigma.pfe.Models.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController)context.getBean("controller");

        Client clt = new Client("Zahira");
        ctrl.save(clt);

    }
}