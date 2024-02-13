package edu.sullivb.exercises10;
import edu.sullivb.exercises09.Matrix;
public class CircleLand {
    public static void main(String [] args) {
        Circle c = new Circle();
        System.out.println(c);
        Matrix p = c.getCenter();
        p.set(0,0,27);
        System.out.println(c);
    }
}
