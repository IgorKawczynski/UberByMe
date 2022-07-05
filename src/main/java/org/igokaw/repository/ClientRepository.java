package org.igokaw.repository;

import org.igokaw.entity.Client;

public interface ClientRepository {

    void add(Client client1);

    Client findByUId(int uId1);
}
