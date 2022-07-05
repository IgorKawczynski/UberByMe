package org.igokaw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name ="ORDERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ORDERID")
    public int orderId;
    @Column(name="CLIENTID")
    public int clientId;
    @Column(name="ORDERDATE")
    public String orderDate;
    @Column(name="WORTH")
    public double worth;
    @Column(name="DISH")
    public String dish;
    @Column(name="ESTIMATEDTIME")
    public int estimatedTime;
    @Column(name="STATUS")
    public String status;

    public Order(int clientId, String orderDate, double worth, String dish, int estimatedTime, String status) {
        this.clientId = clientId;
        this.orderDate = orderDate;
        this.worth = worth;
        this.dish = dish;
        this.estimatedTime = estimatedTime;
        this.status = status;
    }


//    public Order()
//    {
//
//    }
//
//
//    public Order(int orderId, String orderDate, double worth, String dish,
//                 int clientId, int estimatedTime, String status)
//    {
//        this.orderId = orderId;
//        this.orderDate = orderDate;
//        this.worth = worth;
//        this.dish = dish;
//        this.clientId = clientId;
//        this.estimatedTime = estimatedTime;
//        this.status = status;
//    }
//
//    public int getorderId()
//    {
//        return orderId;
//    }
//
//    public void setorderId(int orderId)
//    {
//        this.orderId = orderId;
//    }
//
//    public String getDate()
//    {
//        return orderDate;
//    }
//
//    public void setDate(String orderDate)
//    {
//        this.orderDate = orderDate;
//    }
//
//    public double getWorth()
//    {
//        return worth;
//    }
//
//    public void setWorth(double worth)
//    {
//        this.worth = worth;
//    }
//
//    public String getDish()
//    {
//        return dish;
//    }
//
//    public void setDishes(String dish)
//    {
//        this.dish = dish;
//    }
//
//    public int getClientId()
//    {
//        return clientId;
//    }
//
//    public void setClientId(int clientId)
//    {
//        this.clientId = clientId;
//    }
//
//    public int getEstimatedTime()
//    {
//        return estimatedTime;
//    }
//
//    public void setEstimatedTime(int estimatedTime)
//    {
//        this.estimatedTime = estimatedTime;
//    }
//
//    public String getStatus()
//    {
//        return status;
//    }
//
//    public void setStatus(String status)
//    {
//        this.status = status;
//    }

//    public void receipt()
//    {
//        System.out.println("===RECEIPT===" + '\n'+
//                            "Order ID -- " + orderId + '\n' +
//                            "Date -- " + orderDate + '\n' +
//                            "Summary cost -- " + worth);
//    }

//
//    @Override
//    public String toString()
//    {
//        return "Order{" +
//                "oId=" + orderId +
//                ", date=" + orderDate +
//                ", cost=" + worth +
//                ", clientId=" + clientId +
//                ", estimatedTime=" + estimatedTime +
//                ", status='" + status + '\'' +
//                '}';
//    }
}