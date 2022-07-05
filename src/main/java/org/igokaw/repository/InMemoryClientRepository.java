package org.igokaw.repository;

import org.igokaw.entity.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.NoSuchElementException;

@Repository
public class InMemoryClientRepository implements ClientRepository {

    public ArrayList<Client> clients;

    public InMemoryClientRepository(ArrayList<Client> clients)
    {
        this.clients = clients;
    }

    public ArrayList<Client> getClients()
    {
        return clients;
    }

    public void setClients(ArrayList<Client> clients)
    {
        this.clients = clients;
    }

    public void printClients()
    {
        clients.forEach(System.out::println);
    }

    @Override
    public void add(Client client1)
    {
        this.clients.add(client1);
    }

//    @Override
//    public Client findByEmail(String email)
//    {
//        return this.clients
//                .stream()
//                .filter(client -> client.getEmail().equalsIgnoreCase(email))
//                .findFirst()
//                .orElseThrow(() -> new NoSuchElementException(String.format("Client with following email '%s' does not exist!!", email)));
//
//    }

    public Client findByUId(int uId1)
    {
        return null;
    }

    @Override
    public String toString() {
        return "ClientRepository{" +
                "clients=" + clients +
                '}';
    }
}
