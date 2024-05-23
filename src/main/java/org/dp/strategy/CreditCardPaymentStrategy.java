package org.dp.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void makePayment(){
        System.out.println("made payment with credit card");
    }
}
