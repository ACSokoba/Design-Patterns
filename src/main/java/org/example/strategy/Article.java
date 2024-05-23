package org.example.strategy;

public class Article {
    public void makePayment(PaymentStrategy methode){
        methode.makePayment();
    }
}
