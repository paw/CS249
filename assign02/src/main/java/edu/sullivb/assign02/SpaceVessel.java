package edu.sullivb.assign02;
import java.util.*;

public class SpaceVessel {
    private String vesselName = "";
    private int length = 0;
    private int weight = 0;
    public SpaceVessel () {}
    public SpaceVessel(String n, int h, int w) {
        vesselName = n;
        length = h;
        weight = w;
    }
    /*Setters*/
    public void setName(String name) {
        vesselName = name;
    }
    public void setLength(int feet) {
        length = feet;
    }
    public void setWeight(int pounds) {
        weight = pounds;
    }

    /*Getters*/
    public String getName() {
        return vesselName;
    }
    public int getLength() {
        return length;
    }
    public int getWeight() {
        return weight;
    }
    public String getLengthString() {
        double meters = length * 0.3048;
        return length + " ft. (" + String.format("%.2f",meters) + " m)";
    }
    public String getWeightString() {
        double kilos = weight*0.4536;
        return weight + " lbs. (" + String.format("%.2f",kilos) + " kg)";
    }
    public String toString() {
        return "NAME: " + vesselName + "\nLENGTH: " + getLengthString() + "\nWEIGHT: " + getWeightString() + "\n";
    }
}

