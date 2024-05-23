package org.example;

import org.example.factory.Dish;
import org.example.factory.DishFactory;
import org.example.factory.PizzaFactory;
import org.example.factory.SandwichFactory;
import org.example.singleton.Singleton;
import org.example.strategy.Article;
import org.example.strategy.CreditCardPaymentStrategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Testing strategy-----");
        Article a = new Article();
        a.makePayment(new CreditCardPaymentStrategy());

        System.out.println("-----Testing singleton-----");
        Singleton singleInstance = Singleton.getInstance();
        singleInstance.setName("Joe");
        System.out.println("name in singleton " + singleInstance.getName());

        System.out.println("-----Testing factory-----");
        DishFactory df = new PizzaFactory();
        DishFactory sw = new SandwichFactory();
        Dish pizza = df.createDish();
        Dish sandwich = sw.createDish();
        sandwich.prepare();
        pizza.prepare();
        sandwich.serve();
        pizza.serve();
    }
}