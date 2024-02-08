package edu.sullivb.exercises07;
import edu.sullivb.exercises06.*;

public class MethodLand {

    public static void noChangePrimitive(int x) {
        x = 7;
        System.out.println("Tried to change x to 7.");
    }
    public static void noChangeSupplies(Supplies s) {
        s = new Supplies(300);
        System.out.println("Tried to overwrite s with new supplies object.");
    }
    public static void doesChangeSupplies(Supplies s) {
        s.setTotalFood(400);
        System.out.println("Updated food of s with class method.");
    }
    public static void main(String [] args) {
        int x = 5;
        System.out.println("Created x, which equals " + x);
        noChangePrimitive(x);
        System.out.println("x equals " + x);
        Supplies s = new Supplies(200);
        System.out.println("Created supplies:\n" + s);
        noChangeSupplies(s);
        System.out.println(s);
        doesChangeSupplies(s);
        System.out.println(s);
    }
}
