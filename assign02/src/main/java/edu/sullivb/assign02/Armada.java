package edu.sullivb.assign02;
import java.util.*;
public class Armada {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter vessel name: ");
        SpaceVessel vessel = new SpaceVessel();

        vessel.setName(input.nextLine());

        System.out.println("Enter length and weight: ");

        String line = input.nextLine();

        Scanner parseLine = new Scanner(line);

        vessel.setLength(parseLine.nextInt());
        vessel.setWeight(parseLine.nextInt());

        System.out.println(vessel.toString());
    }
}
