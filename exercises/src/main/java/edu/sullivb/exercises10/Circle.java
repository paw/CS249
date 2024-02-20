package edu.sullivb.exercises10;
import edu.sullivb.exercises09.Matrix;

public class Circle {
    // Data w/ Defaults
    private static final double DEFAULT_RADIUS = 1.0;
    private double radius = DEFAULT_RADIUS; // 1.0
    private Matrix pos = Matrix.makePoint2D(0,0); // (0,0)

    // Constructors
    public Circle() {
        this(DEFAULT_RADIUS, Matrix.makePoint2D(0,0));
    } // creates a unit circle at 0,0
    public Circle(double r) {
        this(r, Matrix.makePoint2D(0,0));
    }
    public Circle(Matrix c) {
        this(DEFAULT_RADIUS, c);
    }
    public Circle(double r, Matrix c) {
        setRadius(r);
        setCenter(c);
    }

    // Getters & Setters
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
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

    public void judgeMyself() {
        judgeCircle(this);
    }

    public static void judgeCircle(Circle c) {
        if (c.getRadius() > 5.0) {
            System.out.println("BIG CIRCLE");
        } else {
            System.out.println("small circle");
        }
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
