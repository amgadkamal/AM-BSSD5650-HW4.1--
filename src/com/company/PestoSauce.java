package com.company;

public class PestoSauce  extends ToppingDecorator {

    public PestoSauce(Pizza tempPizza ){
        super(tempPizza);

        System.out.println("Adding Pesto Sauce");

    }


    @Override
    public String getDescription(){
        return super.getDescription() + " Pesto Sauce";
    }

    @Override
    public double getCost(){
        return super.getCost()+ 1;
    }
}
