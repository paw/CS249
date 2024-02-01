package edu.sullivb.assign02;
import java.util.*;
public class Armada {
    public static void main(String [] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);

        //create initial space vessel
        SpaceVessel vessel = new SpaceVessel();

        //get & set the vessel's name
        System.out.println("Enter vessel name: ");
        vessel.setName(input.nextLine());

        //get the length and weight in one line
        System.out.println("Enter length and weight: ");
        String line = input.nextLine();

        //parse the input and set length & weight
        Scanner parseLine = new Scanner(line);
        vessel.setLength(parseLine.nextInt());
        vessel.setWeight(parseLine.nextInt());

        //print out the vessel's string
        System.out.println(vessel);
    }
}
