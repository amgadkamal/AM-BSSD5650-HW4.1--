package com.company;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(   Pizza tempPizza ){
        super(tempPizza);

        System.out.println("Adding tomato sauce");

    }


    @Override
    public String getDescription(){
        return super.getDescription() + "Tomato sauce";
    }

    @Override
    public double getCost(){
        return super.getCost()+ .35;
    }
}