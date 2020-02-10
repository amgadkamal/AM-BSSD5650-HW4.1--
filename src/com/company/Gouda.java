package com.company;


public class Gouda extends ToppingDecorator {

    public Gouda (Pizza tempPizza ){
        super(tempPizza);

        System.out.println("Adding gouda");

    }


    @Override
    public String getDescription(){
        return super.getDescription() + " gouda";
    }

    @Override
    public double getCost(){
        return super.getCost()+ 2;
    }
}
