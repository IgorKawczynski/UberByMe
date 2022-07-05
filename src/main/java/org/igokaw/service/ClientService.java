package org.igokaw.service;

import org.igokaw.entity.Client2;
import org.igokaw.repository.Client2Repository;
import org.igokaw.repository.annotation.HibernateClient2RepositoryQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    public final Client2Repository client2Repository;

    //Autowired mówi springowi, aby przy tworzeniu Beana ClientService znaleźć w kontekście (context)
    // tego Client2Repository z konstruktora i wstrzyknąć go w pole powyżej
    @Autowired
    public ClientService(@HibernateClient2RepositoryQualifier Client2Repository client2Repository) {
        this.client2Repository = client2Repository;
    }

    public void add(Client2 client2){
        client2Repository.add(client2);
    }

    public Client2 findByUId(int uId){
        return client2Repository.findByUId(uId);
    }

//    public void accountRecharge()
//    {
//
//    }

}
