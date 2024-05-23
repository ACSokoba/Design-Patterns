package org.example.strategy;

public class CheckPaymentStrategy implements PaymentStrategy {

    @Override
    public void makePayment(){
        System.out.println("made payment with check");
    }
}
