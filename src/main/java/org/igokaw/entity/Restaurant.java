package org.igokaw.entity;

import javax.persistence.Entity;

@Entity
public class Restaurant extends User{

    public String address;
    public Menu menu;
    public String name;
    public float rate;
    public String type;
    public int uId;

    public Restaurant() {
    }

    public Restaurant(String gId, int uId, String email,
                      String password, String phoneNumber,
                      String address, Menu menu, String name,
                      float rate, String type)
    {
        super(gId, email, password, phoneNumber);
        this.uId = uId;
        this.address = address;
        this.menu = menu;
        this.name = name;
        this.rate = rate;
        this.type = type;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public Menu getMenu()
    {
        return menu;
    }

    public void setMenu(Menu menu)
    {
        this.menu = menu;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public float getRate()
    {
        return rate;
    }

    public void setRate(float rate)
    {
        this.rate = rate;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
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

    public void confirmPickUp()
    {

    }

    public void confirmRealisation()
    {

    }

    public float calculateAverageRate()
    {
        return 0;
    }

    @Override
    public String toString() {
        return  "\n|Restaurant|" +
                "\nID=" + uId +
                "\naddress=" + address +
                "\nname=" + name +
                "\ntype=" + type +
                "\nrate=" + rate +
                "\nmenu=" + menu +
                "\nemail=" + email +
                "\npassword=" + password +
                "\nphone number=" + phoneNumber + '\n';
    }

}
