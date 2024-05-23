package org.dp.factory;

public class Sandwich implements Dish{
    @Override
    public void prepare(){
        System.out.println("prepare sandwich");
    }

    @Override
    public void serve(){
        System.out.println("serve sandwich");
    }
}
