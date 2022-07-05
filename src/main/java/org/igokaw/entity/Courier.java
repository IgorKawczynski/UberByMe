package org.igokaw.entity;

import javax.persistence.Entity;

@Entity
public class Courier extends User {

    public String address;
    public String firstName;
    public String secondName;
    public int uId;

    public Courier() {
    }

    public Courier(String gId, int uId, String email, String password, String phoneNumber,
                   String address, String firstName, String secondName)
    {
        super(gId, email, password, phoneNumber);
        this.uId = uId;
        this.address = address;
        this.firstName = firstName;
        this.secondName = secondName;
    }


    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getSecondName()
    {
        return secondName;
    }

    public void setSecondName(String secondName)
    {
        this.secondName = secondName;
    }

    @Override
    public int getuId()
    {
        return uId;
    }

    @Override
    public void setuId(int uId)
    {
        this.uId = uId;
    }

    public void cancelOrder()
    {

    }

    public void confirmDelivery()
    {

    }

    public void takeOrder()
    {

    }

    @Override
    public String toString() {
        return  "\n|Courier|" +
                "\nID=" + uId +
                "\nfirst name=" + firstName +
                "\nsecond name=" + secondName +
                "\naddress=" + address +
                "\nemail=" + email +
                "\npassword=" + password +
                "\nphone number=" + phoneNumber + '\n';
    }

}
