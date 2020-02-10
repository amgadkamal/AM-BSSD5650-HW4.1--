package com.company;

public class Pepperoni extends ToppingDecorator {

    public Pepperoni (Pizza tempPizza ){
        super(tempPizza);

        System.out.println("Adding Pepperoni");

    }


    @Override
    public String getDescription(){
        return super.getDescription() + " Pepperoni";
    }

    @Override
    public double getCost(){
        return super.getCost()+ 2;
    }
}