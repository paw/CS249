package edu.sullivb.exercises10;

public class OregonTrail {
    public static void main(String [] args) {
        String [] names = {"Spike","Jet","Faye","Ein","Vault Boy"};
        Party party = new Party(names);
        System.out.println(party);
        party.getMember("the final pam");
        System.out.println("test index: " + party.getMemberByIndex(2).getName());
        System.out.println("YOU HAVE BEEN CHOSEN: " + party.getMember("vault boy") .getName() + "\n");
        party.getMember("vault boy").die();
        System.out.println(party);
        System.out.println(party.isDead());


    }
}
