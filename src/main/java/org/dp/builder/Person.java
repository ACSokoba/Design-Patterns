package org.dp.builder;

public class Person {
    private String name;
    private Integer age;
    private String city;

    public static Person builder(){
        return new Person();
    }

    public Person build(){
        return this;
    }

    public Person name(String name){
        this.name = name;
        return this;
    }

    public Person age(Integer age){
        this.age = age;
        return this;
    }

    public Person city(String city){
        this.city = city;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
