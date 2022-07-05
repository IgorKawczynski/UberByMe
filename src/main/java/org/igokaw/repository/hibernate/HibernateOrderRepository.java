package org.igokaw.repository.hibernate;

import org.hibernate.Session;
import org.igokaw.entity.Order;
import org.igokaw.repository.OrderRepository;
import org.igokaw.repository.annotation.HibernateOrderRepositoryQualifier;
import org.springframework.stereotype.Repository;

//Implementacja interfejsu nadrzędnego - dzięki temu jak będziemy instancjonować interfejs, będziemy
//odnosili się do bazy danych hibernate'a
@Repository
@HibernateOrderRepositoryQualifier
public class HibernateOrderRepository implements OrderRepository {


    @Override
    public void add(Order order1)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(order1);
        session.getTransaction().commit();
    }
}
