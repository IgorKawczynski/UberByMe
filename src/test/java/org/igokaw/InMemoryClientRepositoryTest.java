package org.igokaw;

import org.igokaw.entity.AccountType;
import org.igokaw.entity.Client;
import org.igokaw.entity.Order;
import org.igokaw.repository.InMemoryClientRepository;
import org.junit.jupiter.api.Test;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


public class InMemoryClientRepositoryTest {

    InMemoryClientRepository inMemoryClientRepository = new InMemoryClientRepository(new ArrayList<>());

    Client client1 = new Client(1, "Zeromino, ul. Wiertalaka 54", "Artur", "Kraszewski",
            "1541342158679421", false, 0d);

    Client client2 = new Client(2, "Zeromino, ul. Wiertalaka 54", "Mateusz", "Kikobelle",
            "9999342158679421", true, 100d);

    Client client3 = new Client(3, "Zeromino, ul. Amadeusza Ferre 1", "Magda", "Bosak",
            "246342158679421", false, 0d);


    @Test
    public void verifyAddingUsersToRepository(){
        inMemoryClientRepository.add(client1);
        inMemoryClientRepository.add(client2);
        inMemoryClientRepository.add(client3);
    }

    //NIE PRINUJE BO DODAJE W TEŚCIE ABY //TODO
    @Test
    public void verifyIfRepositoryIsPrintingProperly(){
        inMemoryClientRepository.printClients();
    }
}

