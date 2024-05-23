package org.example;

import org.example.strategy.Article;
import org.example.strategy.CreditCardPaymentStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Article a = new Article();
        a.makePayment(new CreditCardPaymentStrategy());
    }
}