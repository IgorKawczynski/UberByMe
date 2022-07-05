package org.igokaw.entity;

import javax.persistence.*;


public class Client extends User {

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
    @Column(name="UID")
    public int uId;


//    public Client(AccountType gId, int uId, String email, String password, String phoneNumber,
//                  String address, String firstName, String secondName, String cardNumber,
//                  Boolean premium, Double portfolioBalance)
//    {
//        super(gId, email, password, phoneNumber);
//        this.uId = uId;
//        this.address = address;
//        this.firstName = firstName;
//        this.secondName = secondName;
//        this.cardNumber = cardNumber;
//        this.premium = premium;
//        this.portfolioBalance = portfolioBalance;
//    }


    public Client(String gId, int uId, String email, String password, String phoneNumber,
                  String address, String firstName, String secondName)
    {
        super(gId, email, password, phoneNumber);
        this.uId = uId;
        this.address = address;
        this.firstName = firstName;
        this.secondName = secondName;
    }


    public Client(int uId, String address, String firstName, String secondName, String cardNumber,
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
}
