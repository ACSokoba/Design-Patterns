package org.dp.strategy;

public class Article {
    public void makePayment(PaymentStrategy methode){
        methode.makePayment();
    }
}
