package edu.sullivb.exercises06;
import java.util.*;
public class GeneralStore {
    /*top down approach: assume everything will work and then fill in gaps*/
    public void enter(Scanner input, Supplies supplies) {
        // Print Greeting
        printGreetings();

        int cnt = 0;

        // In do-while loop...
        do {
            // Ask what you want to buy
            System.out.println("What do you want to buy/sell?");

            // User enters count food
            String line = input.nextLine();
            Scanner parseLine = new Scanner(line);
            cnt = parseLine.nextInt();
            String item = parseLine.next();

            // Update Supplies
            updateSupplies(cnt, item, supplies);

            // print current supplies
            System.out.println("current supplies:");
            System.out.println(supplies);
        // while cnt != 0
        } while(cnt != 0);

        // print goodbye
        printGoodbye();
    }
    private void printGreetings() {
        System.out.println("** WELCOME TO GENERAL STORE! **");
    }
    private void printGoodbye() {
        System.out.println("** SAFE TRAVELS, FRIEND! **");
    }
    private void updateSupplies(int cnt, String item, Supplies supplies) {
        String itemName = item.toLowerCase();

        switch(itemName) {
            case "food" -> {
                /*int current = supplies.getTotalFood();
                int updated = current + cnt;
                if (updated < 0) {
                    cnt = cnt - updated;
                    updated = 0;
                }
                supplies.setTotalFood(updated);
                 */
                cnt = supplies.updateTotalFood(cnt);
            } default -> {
                System.out.println("Sorry, we don't carry " + itemName + ".");
                cnt = 0;
            }
        }
    }
}
