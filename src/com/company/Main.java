package com.company;

public class Main {

    public static  void main(String[] args) {

        //first pizza with implement thick to plainpizza
        Pizza basicPizza = new Pepperoni(new Gouda( new mushrooms(new mushrooms(new TomatoSauce( new PlainPizza ("thick"))))));
        System.out.println("Ingredients:" + basicPizza.getDescription());
        System.out.println("Cost "+basicPizza.getCost() + "\n");

        //second pizza with implement thin to plainpizza
        Pizza basicPizza2 = new onions(new mushrooms(new PestoSauce( new AlfredaSauce(new PlainPizza("thin")))));
        System.out.println("Ingredients:" + basicPizza2.getDescription());
        System.out.println("Cost "+basicPizza2.getCost()+ "\n");

        //third pizza with implement crustless to plainpizza
        Pizza basicPizza3 = new lettuce(new Gouda( new PestoSauce(new PlainPizza("crust-less"))));
        System.out.println("Ingredients:" + basicPizza3.getDescription());
        System.out.println("Cost "+basicPizza3.getCost());



    }
}
