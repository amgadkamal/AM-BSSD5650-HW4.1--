package com.company;

public class Mozzarella extends ToppingDecorator{

    public Mozzarella(Pizza tempPizza){
        super(tempPizza);

        System.out.println("Adding Mozzarella");

    }


  @Override
  public String getDescription(){
    return super.getDescription() + " Mozzarella";
  }

    @Override
    public double getCost(){
        return super.getCost()+ .5;
    }
}