//package org.igokaw;
//
//import java.util.Scanner;
//import org.igokaw.entity.*;
//import org.igokaw.repository.Client2Repository;
//import org.igokaw.repository.OrderRepository;
//import org.igokaw.repository.hibernate.HibernateClient2RepositoryQualifier;
//import org.igokaw.repository.hibernate.HibernateOrderRepository;
//import org.igokaw.repository.hibernate.HibernateUserRepositoryQualifier;
//import org.igokaw.repository.jdbc.JDBCUserRepositoryQualifier;
//import org.igokaw.repository.UserRepository;
//
//
//public class Main {
//    public static void main(String[] args) {
//
//
////        //WITH JDBC DATABASE --- WORKING PROPERLY
////        User user1 = new User(AccountType.CLIENT, 144, "paweyek1@onet.eu", "kozacci151",
////                "508088354");
////
////        User user2 = new User(AccountType.CLIENT, 145, "paweyek2@onet.eu", "kozacci151",
////                "508088354");
////
////        User user3 = new User(AccountType.CLIENT, 146, "paweyek3@onet.eu", "kozacci151",
////                "508088354");
////
////
////        final UserRepository userRepository2 = new JDBCUserRepositoryQualifier();
////
////        userRepository2.add(user1);
////        userRepository2.add(user2);
////        userRepository2.add(user3);
////
////        int i = 100;
////
////        System.out.println("""
////                Witam w projekcie UberByMe !\s
////                WPISZ 1, aby dodać nowego usera do listy\s
////                Wpisz 2, aby wyszukać Usera po uId w liście\s
////                WPISZ 3, aby zakonczyc program \n""");
////
////        try (Scanner scanner = new Scanner(System.in)) {
////            while (true) {
////                System.out.println("\n1 - add user");
////                System.out.println("2 - find user");
////                System.out.println("3 - exit app\n");
////                final String next = scanner.nextLine();
////                if (next.equals("1")) {
////                    System.out.println("Podaj email :");
////                    String email = scanner.nextLine();
////                    System.out.println("Podaj password :");
////                    String password = scanner.nextLine();
////                    System.out.println("Podaj numerTel :");
////                    String phoneNumber = scanner.nextLine();
////                    User userX = new User(AccountType.CLIENT, i, email, password,
////                            phoneNumber);
////                    i = i + 1;
////
////                    userRepository2.add(userX);
////                }
////                if (next.equals("2")) {
////                    System.out.println("PODAJ uId");
////                    int uId2 = scanner.nextInt();
////                    System.out.println(userRepository2.findByUId(uId2).getEmail());
////                }
////                if (next.equals("3")) {
////                    System.out.println(userRepository2);
////                    break;
////                }
////                System.out.println("CLIENT 1 : " + userRepository2.findByUId(1).getEmail());
////
////
////            }
////        }
//
//
//
//        //WITH HIBERNATE DATABASE --- CLIENT2
//        //TODO -- RELACJA ONEtoONE między USER a CLIENT
//        //TODO -- RELACJA ONEtoMANY między CLIENT a ORDERS
//        //TODO -- W ENCJI KLIENTA PRIMARY KEY != FOREIGN KEY DO USERA, WIĘC TO MOŻLIWIE JEST DO POPRAWY
//        //TODO -- NAIWNIE JEST CLIENTID ORAZ UID
//        //TODO -- PRZEZ TO PRAWDOPODOBNIE CLIENTID SIĘ ŹLE DODAJE, NAWET GDY BŁĘDNIE DAMY USERA TO
//        //TODO -- CLIENTID SIĘ INKREMENTUJE, MOŻE TO KWESTIA DODANIA SESSION.CLOSE() PRZY KLASACH HIBERNATE
//
//
////        User user1 = new User( "CLIENT",  "pawzeyeqe1eks1@onet.eu", "kozacci151",
////                "508088354");
////
////        User user2 = new User("CLIENT",  "pawzqeyeeeks2@onet.eu", "kozacci151",
////                "508088354");
////
////        User user3 = new User("CLIENT",  "paweqzyeeks222@onet.eu", "kozacci151",
////                "508088354");
////
////
////
////        Client2 client1 = new Client2( 1, "Zeromino, ul. Swietojanska 54", "Igorek", "Banduras",
////                "5941874654329989", true, 500d);
////
////        Client2 client2 = new Client2(2, "Zeromino, ul. Wawrzynca 23", "Paweyek", "Banduras",
////                "5841874654329989", true, 650d);
////
////        Client2 client3 = new Client2(3, "Zeromino, ul. Wiertalaka 11", "Adriano", "Alejandro",
////                "4444876847140000", false, 0d);
////
////
////        Order order1 = new Order( 1, "03.03.2003", 45d, "Fish with cebulette", 1, "Ready");
////        Order order2 = new Order( 1,"04.04.2004", 65d, "Miodne Onions", 0, "Ready");
////        Order order3 = new Order( 2, "05.05.2005", 25d, "A baguette", 0, "Ready");
////        Order order4 = new Order( 2, "06.06.2006", 15d, "Beer with strawberries", 0, "Ready");
////        Order order5 = new Order( 3, "07.07.2007", 15d, "Orange juice", 0, "Ready");
////
////
////        final UserRepository userRepository2 = new HibernateUserRepositoryQualifier();
////        userRepository2.add(user1);
////        userRepository2.add(user2);
////        userRepository2.add(user3);
////
////        final Client2Repository client2Repository = new HibernateClient2RepositoryQualifier();
////        client2Repository.add(client1);
////        client2Repository.add(client2);
////        client2Repository.add(client3);
////
////        final OrderRepository orderRepository = new HibernateOrderRepository();
////        orderRepository.add(order1);
////        orderRepository.add(order2);
////        orderRepository.add(order3);
////        orderRepository.add(order4);
////        orderRepository.add(order5);
//
//
//        System.out.println("""
//                Witam w projekcie UberByMe !\s
//                WPISZ 1, aby dostać się do bazy użytkowników\s
//                Wpisz 2, aby dostać się do bazy klientów\s
//                WPISZ 3, aby dostać się do bazy zamówień\s
//                WPISZ 4, aby zakończyć program\n""");
//
//        try (Scanner scanner = new Scanner(System.in)) {
//            while (true) {
//                final String next = scanner.nextLine();
//                if (next.equals("1")) {
//                    final UserRepository userRepository2 = new HibernateUserRepositoryQualifier();
//                    System.out.println("Witam w bazie danych użytkowników !");
//                    try (Scanner scanner2 = new Scanner(System.in)) {
//                        while (true) {
//                            System.out.println("""
//                                        WPISZ 1, aby dodać nowego użytkownika\s
//                                        Wpisz 2, aby znaleźć użytkownika poprzez ID\s
//                                        WPISZ 3, aby wyjść z programu\n""");
//                            final String next2 = scanner2.nextLine();
//                            if (next2.equals("1")) {
//                                System.out.println("Podaj email :");
//                                String email = scanner2.nextLine();
//                                System.out.println("Podaj password :");
//                                String password = scanner2.nextLine();
//                                System.out.println("Podaj numerTel :");
//                                String phoneNumber = scanner2.nextLine();
//
//                                User userX = new User("CLIENT", email, password,
//                                        phoneNumber);
//                                userRepository2.add(userX);
//                            }
//                            if (next2.equals("2")) {
//                                System.out.println("PODAJ ID");
//                                int uId2 = scanner.nextInt();
//                                System.out.println(userRepository2.findByUId(uId2).getEmail());
//                            }
//                            if (next2.equals("3")) {
//                                System.out.println("Wychodzę z programu...");
//                                break;
//                            }
//                        }
//                    }
//                }
//                if (next.equals("2")) {
//                    final Client2Repository client2Repository = new HibernateClient2RepositoryQualifier();
//                    System.out.println("Witam w bazie danych klientów !");
//                    try (Scanner scanner3 = new Scanner(System.in)) {
//                        while (true) {
//                            System.out.println("""
//                                           WPISZ 1, aby dodać nowego klienta\s
//                                           Wpisz 2, aby znaleźć klienta poprzez ID\s
//                                           WPISZ 3, aby wyjść z programu\n""");
//                            final String next3 = scanner3.nextLine();
//                            if (next3.equals("1")) {
//                                System.out.println("Podaj ID :");
//                                int uId = scanner3.nextInt();
//                                System.out.println("Podaj adres :");
//                                String address = scanner3.nextLine();
//                                System.out.println("Podaj imie :");
//                                String firstName = scanner3.nextLine();
//                                System.out.println("Podaj nazwisko :");
//                                String secondName = scanner3.nextLine();
//                                System.out.println("Podaj nr. karty kredytowej :");
//                                String cardNumber = scanner3.nextLine();
//                                System.out.println("Chcesz premium? (true-tak, false-nie) :");
//                                Boolean premium = scanner3.nextBoolean();
//                                double portfolioBalance = 0d;
//                                if (premium) {
//                                    System.out.println("Ile chcesz poczatkowo wplacic do konta? :");
//                                    portfolioBalance = scanner3.nextDouble();
//                                }
//                                Client2 client2X = new Client2(uId, address, firstName, secondName,
//                                        cardNumber, premium, portfolioBalance);
//                                client2Repository.add(client2X);
//                            }
//                            if (next3.equals("2")) {
//                                System.out.println("PODAJ uId");
//                                int uId2 = scanner3.nextInt();
//                                System.out.println(client2Repository.findByUId(uId2).getFirstName());
//                            }
//                            if (next3.equals("3")) {
//                                System.out.println("Wychodzę z programu...");
//                                break;
//                            }
//                        }
//                    }
//                }
//                if (next.equals("3")) {
//                    final OrderRepository orderRepository = new HibernateOrderRepository();
//                    System.out.println("Witam w bazie danych zamówień !");
//                    try (Scanner scanner4 = new Scanner(System.in)) {
//                        while (true) {
//                            System.out.println("""
//                                            WPISZ 1, aby dodać nowe zamówienie\s
//                                            WPISZ 2, aby wyjść z programu\n""");
//                            final String next4 = scanner4.nextLine();
//                            if (next4.equals("1")) {
//                                System.out.println("Podaj ID klienta :");
//                                int clientId = scanner4.nextInt();
//                                System.out.println("Podaj datę zamówienia :");
//                                String date = scanner4.nextLine();
//                                System.out.println("Podaj cenę zamówienia :");
//                                double worth = scanner4.nextDouble();
//                                System.out.println("Podaj nazwę zamówienia :");
//                                String dish = scanner4.nextLine();
//                                System.out.println("Za ile oscylacyjnie gotowe? :");
//                                int estimatedTime = scanner4.nextInt();
//                                System.out.println("Podaj status zamówienia :");
//                                String status = scanner4.nextLine();
//
//                                Order orderX = new Order(clientId, date, worth, dish, estimatedTime, status);
//                                orderRepository.add(orderX);
//                            }
//                            if (next4.equals("2")) {
//                                System.out.println("Wychodzę z programu...");
//                                break;
//                            }
//                        }
//                    }
//                }
//                if(next.equals("4")){
//                    System.out.println("Wychodzę z programu...");
//                }
//                break;
//            }
//        }
//    }
//}












package org.igokaw;

import java.util.Scanner;
import org.igokaw.entity.*;
import org.igokaw.repository.Client2Repository;
import org.igokaw.repository.OrderRepository;
import org.igokaw.repository.hibernate.HibernateClient2Repository;
import org.igokaw.repository.hibernate.HibernateOrderRepository;
import org.igokaw.repository.hibernate.HibernateUserRepository;
import org.igokaw.repository.UserRepository;
import org.igokaw.service.ClientService;
import org.igokaw.service.OrderService;
import org.igokaw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main implements CommandLineRunner {

    public final UserService userService;
    public final ClientService clientService;
    public final OrderService orderService;

    @Autowired
    public Main(UserService userService, ClientService clientService, OrderService orderService) {
        this.userService = userService;
        this.clientService = clientService;
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("""
                Witam w projekcie UberByMe !\s
                WPISZ 1, aby dostać się do bazy użytkowników\s
                Wpisz 2, aby dostać się do bazy klientów\s
                WPISZ 3, aby dostać się do bazy zamówień\s
                WPISZ 4, aby zakończyć program\n""");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                final String next = scanner.nextLine();
                if (next.equals("1")) {
                    System.out.println("Witam w bazie danych użytkowników !");
                    try (Scanner scanner2 = new Scanner(System.in)) {
                        while (true) {
                            System.out.println("""
                                    WPISZ 1, aby dodać nowego użytkownika\s
                                    Wpisz 2, aby znaleźć użytkownika poprzez ID\s
                                    WPISZ 3, aby wyjść z programu\n""");
                            final String next2 = scanner2.nextLine();
                            if (next2.equals("1")) {
                                System.out.println("Podaj email :");
                                String email = scanner2.nextLine();
                                System.out.println("Podaj password :");
                                String password = scanner2.nextLine();
                                System.out.println("Podaj numerTel :");
                                String phoneNumber = scanner2.nextLine();

                                User userX = new User("CLIENT", email, password,
                                        phoneNumber);
                                userService.add(userX);
                            }
                            if (next2.equals("2")) {
                                System.out.println("PODAJ ID");
                                int uId2 = scanner.nextInt();
                                System.out.println(userService.findByUId(uId2).getEmail());
                            }
                            if (next2.equals("3")) {
                                System.out.println("Wychodzę z programu...");
                                break;
                            }
                        }
                    }
                }
                if (next.equals("2")) {
                    System.out.println("Witam w bazie danych klientów !");
                    try (Scanner scanner3 = new Scanner(System.in)) {
                        while (true) {
                            System.out.println("""
                                    WPISZ 1, aby dodać nowego klienta\s
                                    Wpisz 2, aby znaleźć klienta poprzez ID\s
                                    WPISZ 3, aby wyjść z programu\n""");
                            final String next3 = scanner3.nextLine();
                            if (next3.equals("1")) {
                                System.out.println("Podaj ID :");
                                int uId = scanner3.nextInt();
                                System.out.println("Podaj adres :");
                                String address = scanner3.nextLine();
                                System.out.println("Podaj imie :");
                                String firstName = scanner3.nextLine();
                                System.out.println("Podaj nazwisko :");
                                String secondName = scanner3.nextLine();
                                System.out.println("Podaj nr. karty kredytowej :");
                                String cardNumber = scanner3.nextLine();
                                System.out.println("Chcesz premium? (true-tak, false-nie) :");
                                Boolean premium = scanner3.nextBoolean();
                                double portfolioBalance = 0d;
                                if (premium) {
                                    System.out.println("Ile chcesz poczatkowo wplacic do konta? :");
                                    portfolioBalance = scanner3.nextDouble();
                                }
                                Client2 client2X = new Client2(uId, address, firstName, secondName,
                                        cardNumber, premium, portfolioBalance);
                                clientService.add(client2X);
                            }
                            if (next3.equals("2")) {
                                System.out.println("PODAJ uId");
                                int uId2 = scanner3.nextInt();
                                System.out.println(clientService.findByUId(uId2).getFirstName());
                            }
                            if (next3.equals("3")) {
                                System.out.println("Wychodzę z programu...");
                                break;
                            }
                        }
                    }
                }
                if (next.equals("3")) {
                    System.out.println("Witam w bazie danych zamówień !");
                    try (Scanner scanner4 = new Scanner(System.in)) {
                        while (true) {
                            System.out.println("""
                                    WPISZ 1, aby dodać nowe zamówienie\s
                                    WPISZ 2, aby wyjść z programu\n""");
                            final String next4 = scanner4.nextLine();
                            if (next4.equals("1")) {
                                System.out.println("Podaj ID klienta :");
                                int clientId = scanner4.nextInt();
                                System.out.println("Podaj datę zamówienia :");
                                String date = scanner4.nextLine();
                                System.out.println("Podaj cenę zamówienia :");
                                double worth = scanner4.nextDouble();
                                System.out.println("Podaj nazwę zamówienia :");
                                String dish = scanner4.nextLine();
                                System.out.println("Za ile oscylacyjnie gotowe? :");
                                int estimatedTime = scanner4.nextInt();
                                System.out.println("Podaj status zamówienia :");
                                String status = scanner4.nextLine();

                                Order orderX = new Order(clientId, date, worth, dish, estimatedTime, status);
                                orderService.add(orderX);
                            }
                            if (next4.equals("2")) {
                                System.out.println("Wychodzę z programu...");
                                break;
                            }
                        }
                    }
                }
                if (next.equals("4")) {
                    System.out.println("Wychodzę z programu...");
                }
                else
                    break;
            }
        }
    }
}
