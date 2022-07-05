package org.igokaw.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int dishId;
    public String name;
    public String description;
    public float value;
    public boolean availability;
    public double weight;

    public Dish() {
    }

    @Override
    public String toString() {
        return "Dish{" +
                "\ndishID=" + dishId +
                "\nname='" + name + '\'' +
                "\ndescription='" + description + '\'' +
                "\nvalue=" + value +
                "\navailability=" + availability +
                "\nweight=" + weight +
                '}';
    }

    public Dish(int dishId, String name, String description, float value, boolean availability, double weight)
    {
        this.dishId = dishId;
        this.name = name;
        this.description = description;
        this.value = value;
        this.availability = availability;
        this.weight = weight;
    }

    public Dish(int dishId, String name, String description, float value, boolean availability)
    {
        this.dishId = dishId;
        this.name = name;
        this.description = description;
        this.value = value;
        this.availability = availability;
    }

    public int getDishId()
    {
        return dishId;
    }

    public void setDishId(int dishId)
    {
        this.dishId = dishId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public float getValue()
    {
        return value;
    }

    public void setValue(float value)
    {
        this.value = value;
    }

    public boolean isAvailability()
    {
        return availability;
    }

    public void setAvailability(boolean availability)
    {
        this.availability = availability;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }
}
