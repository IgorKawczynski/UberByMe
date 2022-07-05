package org.igokaw;

import org.igokaw.entity.AccountType;
import org.igokaw.entity.Client;
import org.igokaw.repository.InMemoryClientRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class ClientTest {

    private Client client1;
    private final InMemoryClientRepository inMemoryClientRepository = new InMemoryClientRepository(new ArrayList<>());

    @BeforeEach
    public void setup()
    {
        client1 = new Client("CLIENT", 29, "igos@op.pl", "kosiur56", "596874012",
                "Zeromino, Zarobasa 53", "Witek", "Gutek");
    }
    // przy nazwie metody testującej trzeba okreslic co ten test ma robic, teraz testowo aby
    @Test
    public void verifyIfUserIsAddingCorrectly()
    {
        //given
        final Client client = new Client("CLIENT", 24, "igore@op.pl", "weqiur56", "596832012",
                "Zeromino, Warmińska 27", "Arnold", "Klasyczny");
        final Client expectedClient = new Client("CLIENT", 24, "igore@op.pl", "weqiur56", "596832012",
                "Zeromino, Warmińska 27", "Arnold", "Klasyczny");
        //when
        inMemoryClientRepository.add(client);
        //then
        final Client actualClient= inMemoryClientRepository.clients.stream().findFirst().get();
        //assert
        assertEquals(expectedClient, actualClient);
    }

    @Test
    public void verifyIfGetterIsWorkingProperly()
    {
        System.out.println(client1.getuId());
    }
}
