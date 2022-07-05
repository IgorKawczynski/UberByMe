package org.igokaw.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Rate {

    public LocalDate date;
    public int restaurantId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int rateId;
    public String description;
    public int rateValue;


    public Rate() {
    }

    public Rate(LocalDate date, int restaurantId, int rateId, String description, int rateValue)
    {
        this.date = date;
        this.restaurantId = restaurantId;
        this.rateId = rateId;
        this.description = description;
        this.rateValue = rateValue;
    }

    public Rate(LocalDate date, int restaurantId, int rateId, int rateValue)
    {
        this.date = date;
        this.restaurantId = restaurantId;
        this.rateId = rateId;
        this.rateValue = rateValue;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public int getRestaurantId()
    {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId)
    {
        this.restaurantId = restaurantId;
    }

    public int getRateId()
    {
        return rateId;
    }

    public void setRateId(int rateId)
    {
        this.rateId = rateId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getRateValue()
    {
        return rateValue;
    }

    public void setRateValue(int rateValue)
    {
        this.rateValue = rateValue;
    }
}
