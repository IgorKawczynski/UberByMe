package org.igokaw.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "USERS")
public class User{

    //@COLUMN(name = "xxxyyy") to describe to which column in database our record is connecting
    //IF COLUMN FROM OUR DATABASE HAS THE SAME NAME AS OUR CLASS RECORD, THERE IS NO NEED TO ADDITIONAL ANNOTATION,
    //I DID IT THERE ANYWAY TO TEST
    @Column(name = "GID")
    public String gId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UID")
    public int uId = 0;

    @Column(name = "EMAIL")
    public String email;

    @Column(name = "PASSWORD")
    public String password;

    @Column(name = "PHONENUMBER")
    public String phoneNumber;

    //DEFAULT CONSTRUCTOR - HIBERNATE NEEDS BOTH GETTERS+SETTERS AND THIS D.CONSTRUCTOR TO WORK PROPERLY
    public User()
    {

    }

    public User(String gId, int uId, String email, String password, String phoneNumber)
    {
        this.gId = gId;
        this.uId = uId;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }


    public User(String gId, String email, String password, String phoneNumber)
    {
        this.gId = gId;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }


    public String getgId()
    {
        return gId;
    }

    public void setgId(String gId)
    {
        this.gId = gId;
    }

    public int getuId()
    {
        return uId;
    }

    public void setuId(int uId)
    {
        this.uId = uId;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void login()
    {

    }

    public void logout()
    {

    }

    public void printOrderingHistory()
    {

    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return uId == user.uId;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(gId, uId, email, password, phoneNumber);
    }

    @Override
    public String toString() {
        return  "\n|User|" +
                "\ngroupID=" + gId +
                "\nuserID=" + uId +
                "\nemail=" + email +
                "\npassword=" + password +
                "\nphone number='" + phoneNumber + '\n';
    }
}
