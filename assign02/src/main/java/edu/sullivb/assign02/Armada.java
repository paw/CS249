package edu.sullivb.assign02;
import java.util.*;
public class Armada {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ship name: ");
        SpaceVessel vessel = new SpaceVessel();
        vessel.setName(input.nextLine());
        System.out.print("Enter the height and weight of '" + vessel.getName() + "', separated by a space: ");
        String line = input.nextLine();
        Scanner parseLine = new Scanner(line);
        vessel.setLength(parseLine.nextInt());
        vessel.setWeight(parseLine.nextInt());
        System.out.println("YOUR SHIP:");
        System.out.println(vessel.toString());
    }
}
