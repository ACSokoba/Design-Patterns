package org.example.factory;

public class SandwichFactory implements DishFactory {
    @Override
    public Dish createDish(){
        return new Sandwich();
    }
}
