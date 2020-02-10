package com.company;


    public class AlfredaSauce extends ToppingDecorator {

        public AlfredaSauce(   Pizza tempPizza ){
            super(tempPizza);

            System.out.println("Adding alfreda sauce");

        }


        @Override
        public String getDescription(){
            return super.getDescription() + "alfreda sauce ";
        }

        @Override
        public double getCost(){
            return super.getCost()+ .45;
        }
    }
