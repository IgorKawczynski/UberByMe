package org.igokaw.repository.hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.igokaw.entity.Client;
import org.igokaw.repository.ClientRepository;
import org.igokaw.repository.annotation.HibernateClientRepositoryQualifier;
import org.springframework.stereotype.Repository;

//Implementacja interfejsu nadrzędnego - dzięki temu jak będziemy instancjonować interfejs, będziemy
//odnosili się do bazy danych hibernate'a
@Repository
@HibernateClientRepositoryQualifier
public class HibernateClientRepository implements ClientRepository {

    @Override
    public void add(Client client1)
    {
        final Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(client1);
        session.getTransaction().commit();
    }

//    @Override
//    public Client findByEmail(String email1)
//    {
//        final Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        final Query<Client> query = session.createQuery("fROM Client WHERE email=:parameter1", Client.class);
//        query.setParameter("parameter1", email1);
//        return query.uniqueResult();
//    }

    @Override
    public Client findByUId(int uId1)
    {
        final Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        final Query<Client> query = session.createQuery("FROM Client WHERE clients_users_fk=:parameter1", Client.class);
        query.setParameter("parameter1", uId1);
        return query.uniqueResult();
    }
}
