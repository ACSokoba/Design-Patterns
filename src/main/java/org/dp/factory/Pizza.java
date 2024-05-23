package org.dp.factory;

public class Pizza implements Dish{
    @Override
    public void prepare(){
        System.out.println("prepare pizza");
    }

    @Override
    public void serve(){
        System.out.println("serve pizza");
    }
}
