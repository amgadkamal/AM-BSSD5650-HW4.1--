package com.company;

public class lettuce extends ToppingDecorator {

    public lettuce (Pizza tempPizza ){
        super(tempPizza);

        System.out.println("Adding lettuce");

    }


    @Override
    public String getDescription(){
        return super.getDescription() + " lettuce";
    }

    @Override
    public double getCost(){
        return super.getCost()+ .3;
    }
}