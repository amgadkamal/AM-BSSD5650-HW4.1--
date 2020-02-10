package com.company;

public class PlainPizza implements Pizza {


    protected String crustPizza;


    public PlainPizza (String crustPizza){

        this.crustPizza = crustPizza;

    }


    @Override
    public String getDescription(){
        if ("thick".equals(crustPizza)) {
            return "Thick crust ";
        }

        if ("thin".equals(crustPizza)) {
            return "Thin crust ";
        }


        if ("crust-less".equals(crustPizza)) {
            return "crust-less ";
        }
        return null;
    }

    @Override
    public double getCost() {
        if ("thick".equals(crustPizza)) {
            return 4;
        }

        if ("thin".equals(crustPizza)) {
            return 4.5;
        }

        if ("crust-less".equals(crustPizza)) {
            return 3.5;
        }


        return 0;

    }
}



