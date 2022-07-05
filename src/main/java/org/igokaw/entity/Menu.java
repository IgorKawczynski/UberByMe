package org.igokaw.entity;

import org.igokaw.entity.Dish;

import javax.persistence.Entity;
import java.util.ArrayList;

public class Menu {

    public ArrayList<Dish> dishes;


    public Menu() {
    }

    public Menu(ArrayList<Dish> dishes)
    {
        this.dishes = dishes;
    }

    public ArrayList<Dish> getDishes()
    {
        return dishes;
    }

    public void setDishes(ArrayList<Dish> dishes)
    {
        this.dishes = dishes;
    }

    public void addDish(Dish dish)
    {
        dishes.add(dish);
    }

    public void removeDish(int index)
    {
        if(dishes != null)
            dishes.remove(index);
    }

}
