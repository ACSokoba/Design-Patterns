package org.dp.strategy;

public class Article {
    public void makePayment(PaymentStrategy method){
        method.makePayment();
    }
}
