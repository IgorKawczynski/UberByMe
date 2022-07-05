package org.igokaw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CLIENTS")
@Data
@AllArgsConstructor
public class Client2{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CLIENTID")
    public int clientId;
    @Column(name="UID")
    public int uId;
    @Column(name="ADDRESS")
    public String address;
    @Column(name="FIRSTNAME")
    public String firstName;
    @Column(name="SECONDNAME")
    public String secondName;
    @Column(name="CARDNUMBER")
    public String cardNumber;
    @Column(name="PREMIUM")
    public Boolean premium;
    @Column(name="PORTFOLIOBALANCE")
    public Double portfolioBalance;
//    @OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.PERSIST)
//    @JoinColumn(name="UID", insertable = false, updatable = false)
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="clientId")
    public List<Order> orders;

    public Client2()
    {
    }

    public Client2(int uId, String address, String firstName, String secondName, String cardNumber,
                   Boolean premium, Double portfolioBalance)
    {
        this.uId = uId;
        this.address = address;
        this.firstName = firstName;
        this.secondName = secondName;
        this.cardNumber = cardNumber;
        this.premium = premium;
        this.portfolioBalance = portfolioBalance;
    }

    public Client2(int clientId, int uId, String address, String firstName, String secondName, String cardNumber, Boolean premium, Double portfolioBalance) {
        this.clientId = clientId;
        this.uId = uId;
        this.address = address;
        this.firstName = firstName;
        this.secondName = secondName;
        this.cardNumber = cardNumber;
        this.premium = premium;
        this.portfolioBalance = portfolioBalance;
    }


    @Override
    public String toString() {
        return "Client2{" +
                "uId=" + uId +
                ", address='" + address + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", premium=" + premium +
                ", portfolioBalance=" + portfolioBalance +
                '}';
    }
}