package org.igokaw.repository.hibernate;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.igokaw.entity.User;
import org.igokaw.repository.UserRepository;
import org.igokaw.repository.annotation.HibernateUserRepositoryQualifier;
import org.springframework.stereotype.Repository;


//Implementacja interfejsu nadrzędnego - dzięki temu jak będziemy instancjonować interfejs, będziemy
//odnosili się do bazy danych hibernate'a
@Repository
@HibernateUserRepositoryQualifier
public class HibernateUserRepository implements UserRepository {

    @Override
    public void add(User user1)
    {
        final Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user1);
        session.getTransaction().commit();
    }

    @Override
    public User findByEmail(String email1)
    {
        final Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        final Query<User> query = session.createQuery("FROM User WHERE email=:parameter1", User.class);
        query.setParameter("parameter1", email1);
        return query.uniqueResult();
    }

    @Override
    public User findByUId(int uId1)
    {
        final Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        final Query<User> query = session.createQuery("fROM User WHERE uId=:parameter2", User.class);
        query.setParameter("parameter2", uId1);
        return query.uniqueResult();
    }
}
