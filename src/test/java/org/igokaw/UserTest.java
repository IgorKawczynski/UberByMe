package org.igokaw;

import org.igokaw.entity.AccountType;
import org.igokaw.entity.Client;
import org.igokaw.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class UserTest {

    private User user1;
    private final ArrayList<User> users = new ArrayList<>() ;

    @BeforeEach
    public void setup()
    {
        user1 = new Client("CLIENT", 29, "igos@op.pl", "kosiur56", "596874012",
                            "Zeromino, Zarobasa 53", "Witek", "Gutek");
    }
    // przy nazwie metody testującej trzeba okreslic co ten test ma robic, teraz testowo aby
    @Test
    public void verifyIfUserIsAddingCorrectly()
    {
        //given
        final Client client = new Client("CLIENT", 24, "igore@op.pl", "weqiur56", "596832012",
                "Zeromino, Warmińska 27", "Arnold", "Klasyczny");
        final Client expectedUser = new Client("CLIENT", 24, "igore@op.pl", "weqiur56", "596832012",
                "Zeromino, Warmińska 27", "Arnold", "Klasyczny");
        //when
        users.add(client);
        //then
        final User actualUser= users.stream().findFirst().get();
        //assert
        assertEquals(expectedUser, actualUser);
    }

    @Test
    public void verifyIfGetterIsWorkingProperly()
    {

        System.out.println(user1.getuId());
    }
}
