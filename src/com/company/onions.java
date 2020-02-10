package com.company;

public class onions extends ToppingDecorator {

    public onions (Pizza tempPizza ){
        super(tempPizza);

        System.out.println("Adding onions");

    }


    @Override
    public String getDescription(){
        return super.getDescription() + " onions";
    }

    @Override
    public double getCost(){
        return super.getCost()+ 2;
    }
}
