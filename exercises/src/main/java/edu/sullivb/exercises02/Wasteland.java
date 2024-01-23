package edu.sullivb.exercises02;

public class Wasteland {
    public static void main(String [] args) {
        System.out.println("War... war never changes.");

        NPC bob = new NPC("Bob Bobertson");
        NPC sue = new NPC("Sally Mcgee");
        NPC fodder = new NPC();

        System.out.println("Our NPCs are named " + bob.getName() + ", " + sue.getName() + ", and " + fodder.getName() + ".");
        System.out.println("Bob's health: " + bob.getHealth());
        bob.setHealth(98);
        System.out.println("Ouch! Bob stubbed his toe.\nBob's health: " + bob.getHealth());
    }
}
