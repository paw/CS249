package edu.sullivb.exercises15.decorator;

public class JavaBytes {
    public static void main(String [] args) {
        Beverage coffee = new MediumRoast();



        System.out.println(coffee.getDesc());
        System.out.println("COST: $" + coffee.cost());
    }
}
