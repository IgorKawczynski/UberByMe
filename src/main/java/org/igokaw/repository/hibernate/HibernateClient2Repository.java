package org.igokaw.repository.hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.igokaw.entity.Client;
import org.igokaw.entity.Client2;
import org.igokaw.repository.Client2Repository;

import org.igokaw.repository.annotation.HibernateClient2RepositoryQualifier;
import org.springframework.stereotype.Repository;

//Implementacja interfejsu nadrzędnego - dzięki temu jak będziemy instancjonować interfejs, będziemy
//odnosili się do bazy danych hibernate'a
@Repository
@HibernateClient2RepositoryQualifier
public class HibernateClient2Repository implements Client2Repository {

    @Override
    public void add(Client2 client)
    {
        final Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(client);
//        client
//                .getOrders()
//                .forEach(session::save);
        session.getTransaction().commit();
    }

    @Override
    public Client2 findByUId(int uId1)
    {
        final Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        final Query<Client2> query = session.createQuery("FROM Client2 WHERE uId=:parameter1", Client2.class);
        query.setParameter("parameter1", uId1);
        final Client2 client2 = query.uniqueResult();
        session.close();
        return client2;
    }
}
