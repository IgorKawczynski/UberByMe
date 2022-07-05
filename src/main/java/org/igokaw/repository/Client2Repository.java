package org.igokaw.repository;

import org.igokaw.entity.Client2;

public interface Client2Repository {

    void add(Client2 client);

    Client2 findByUId(int uId);
}
