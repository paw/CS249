package edu.sullivb.exercises10;
import edu.sullivb.exercises09.Matrix;

public class Circle {
    // Data w/ Defaults
    private double radius = 1.0;
    private Matrix pos = Matrix.makePoint2D(0,0);

    // Constructors
    public Circle() {} // creates a unit circle at 0,0
    public Circle(double r) {
        setRadius(r);
    }
    public Circle(double r, Matrix c) {
        setRadius(r);
        setCenter(c);
    }

    // Getters & Setters
    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        if (r >= 0) {
            radius = r;
        }
    }
    public Matrix getCenter() {
        return new Matrix(pos);
    }
    public void setCenter(Matrix c) {
        pos = new Matrix(c);
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // to Strings
    public String toString() {
        String s = "(Circle)\n";
        s += "radius: " + radius + "\n";
        s += "center:\n";
        s+= pos + "\n";
        return s;
    }
}
