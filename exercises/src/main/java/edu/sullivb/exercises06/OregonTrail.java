package edu.sullivb.exercises06;
import java.util.*;

public class OregonTrail {

    public static void printMenu() {
        String s = "\n";
        s += "******************************\n";
        s += "\t\t\tMENU\n";
        s += "0. Status\n";
        s += "1. Continue On\n";
        s += "2. General Store\n";
        s += "3. Hunt\n";
        s += "9. QUIT\n";
        s+= "******************************\n\n";
        s+= "What do you want to do?\nEnter an option: ";
        System.out.print(s);
    }
    public static void main(String[] args) {
        /*Scanner inp = new Scanner(System.in);
        String input = "";
        int chosen = -1;
        boolean validInput = true;

        Supplies supplies = new Supplies();
        GeneralStore store = new GeneralStore();*/
        menuLoop();

    }
    public static void menuLoop() {
        Scanner inp = new Scanner(System.in);
        String input = "";
        int menuOptionChosen = -1;
        boolean validInput = true;

        Supplies supplies = new Supplies();
        GeneralStore store = new GeneralStore();

        boolean running = true;

        while(running) {
            printMenu();
            input = inp.nextLine();
            Scanner parseInput = new Scanner(input);
            try {
                menuOptionChosen = parseInput.nextInt();
                validInput = true;
            } catch(java.util.InputMismatchException ime) {
                System.out.println("Please enter a number on the menu.");
                menuOptionChosen = -1;
                validInput = false;
            }
            if (validInput) {
                switch(menuOptionChosen) {
                    case 0 -> {
                        System.out.println("STATUS:\n" + supplies);
                    }
                    case 1 -> {
                        System.out.println("Continue on...");
                    }
                    case 2 -> {
                        System.out.println("General Store!");
                        store.enter(inp,supplies);
                    }
                    case 9 -> {
                        System.out.println("QUITTING! You died on the Oregon Trail because you gave up. :(");
                        running = false;
                    }
                    default -> {
                        System.out.println("Please enter a valid menu option.");
                    }
                }
            }
        }
    }
}
