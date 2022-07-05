package org.igokaw;

import org.igokaw.entity.AccountType;
import org.igokaw.entity.Client;
import org.igokaw.entity.Courier;
import org.igokaw.entity.User;
import org.igokaw.repository.InMemoryUserRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class InMemoryUserRepositoryTest {

    InMemoryUserRepository inMemoryUserRepository1 = new InMemoryUserRepository(new ArrayList<>());

//    Client user1 = new Client(AccountType.CLIENT, 50, "igokaw@op.pl", "kosior54",
//            "509067344", "Zeromino, ul. Wiertalaka 54", "Ajgor", "Kosior",
//            "1541342158679421", true, 540d);
//
//    Client user2 = new Client(AccountType.CLIENT, 51, "igores@wp.pl",
//            "helpmepls122", "236893145", "Zeromino, ul. Mielona 21", "Marian", "Pozdzier",
//            "1111111111111111", false, 0d);
//
//    Courier user3 = new Courier(AccountType.COURIER, 52, "kurierAndrzej@onet.pl", "kurier11",
//            "509067344", "Zeromino, ul. Zielona 15", "Andrzej", "Masny");
//
//    Client user4 = new Client(AccountType.CLIENT, 51, "iewqres@wp.pl",
//            "helpmepls122", "236e145", "Zeewqino, ul. Mi32ona 21", "Marian", "Pozdzier",
//            "111111132111", true, 5d);

    User user1 = new User("CLIENT", 1, "ajgoras121@gmejl.com", "password1", "phonenUmber1");

    User user2 = new User("CLIENT", 2, "bajgorens544@gmejl.com", "password2", "phonenUmber2");

    User user3 = new User("CLIENT", 3, "amadiamadi998@gmejl.com", "password3", "phonenUmber3");

    @Test
    public void verifyAddingUsersToRepository(){
        inMemoryUserRepository1.addUser(user1);
        inMemoryUserRepository1.addUser(user2);
        inMemoryUserRepository1.addUser(user3);
        inMemoryUserRepository1.printUserRepository();
    }

    //NIE PRINUJE BO DODAJE W TEŚCIE ABY //TODO
    @Test
    public void verifyIfRepositoryIsPrintingProperly(){
        inMemoryUserRepository1.printUserRepository();
    }
}
