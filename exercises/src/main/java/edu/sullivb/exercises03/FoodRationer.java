package edu.sullivb.exercises03;
import java.util.*; // * for multiple/many
import java.lang.*; // toString stuff

public class FoodRationer {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        final double DECENT_RATIONS = 2;
        final double LOW_RATIONS = 1;
        double rations = DECENT_RATIONS;

        System.out.println("How many people are in your party? ");
        int partyCount = input.nextInt();
        System.out.println("How many pounds of food do you have? ");
        double totalFood = input.nextDouble();

        double foodPerDay = partyCount * rations;
        double daysLeft = totalFood/foodPerDay;
        String lala = Double.toString(rations);

        System.out.println("PARTY: " + partyCount + " people that eat " + lala + " rations per day.\n" + "TOTAL FOOD: " + totalFood);
        System.out.println("DAYS LEFT: " + daysLeft);
    }
}
