package edu.sullivb.exercises12;

import edu.sullivb.exercises09.Matrix;

public class Circle extends Shape {
    private static final double DEFAULT_RADIUS = 1.0;
    private double radius = DEFAULT_RADIUS; // 1.0
    private Matrix pos = Matrix.makePoint2D(0,0); // (0,0)

    // Constructors
    public Circle() {
        this(DEFAULT_RADIUS, Matrix.makePoint2D(0,0));
    } // creates a unit circle at 0,0
    public Circle(double r) {
        //inserts: super() if 1st line doesnt call another constructor
        this(r, Matrix.makePoint2D(0,0));
    }
    public Circle(Matrix c) {
        this(DEFAULT_RADIUS, c);
    }
    public Circle(double r, Matrix c) {
        super(c);
        setRadius(r);
        //this.setCenter(c);
    }
    public Circle(double r, Matrix c, boolean filled) {
        super(c, filled);
        setRadius(r);
        //this.setCenter(c);
        //this.filled = filled;
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
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        String s = "Circle: ";
        s+= "radius= " + this.getRadius();
        s+= " --> " + super.toString();
        return s;
    }
}
