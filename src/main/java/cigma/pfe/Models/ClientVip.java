package cigma.pfe.Models;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data

public class ClientVip extends Client{

    private String preferences;

    public ClientVip(String name, String preferences) {
        super(name);
        this.preferences = preferences;
    }

}
