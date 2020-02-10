package com.company;


    public class mushrooms  extends ToppingDecorator {

        public mushrooms(Pizza tempPizza ){
            super(tempPizza);

            System.out.println("Adding Mushrooms");

        }


        @Override
        public String getDescription(){
            return super.getDescription() + " Mushrooms";
        }

        @Override
        public double getCost(){
            return super.getCost()+ 1;
        }
    }

