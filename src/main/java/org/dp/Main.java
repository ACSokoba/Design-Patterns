package org.dp;

import org.dp.factory.Dish;
import org.dp.factory.DishFactory;
import org.dp.factory.PizzaFactory;
import org.dp.factory.SandwichFactory;
import org.dp.singleton.Singleton;
import org.dp.strategy.Article;
import org.dp.strategy.CreditCardPaymentStrategy;

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