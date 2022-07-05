package org.igokaw.service;

import org.igokaw.entity.Order;
import org.igokaw.repository.OrderRepository;
import org.igokaw.repository.annotation.HibernateOrderRepositoryQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public final OrderRepository orderRepository;

    //Autowired mówi springowi, aby przy tworzeniu Beana OrderService znaleźć w kontekście (context)
    // tego OrderRepository z konstruktora i wstrzyknąć go w pole powyżej
    @Autowired
    public OrderService(@HibernateOrderRepositoryQualifier OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void add(Order order1){
        orderRepository.add(order1);
    }
}
