package edu.sullivb.exercises10;
import edu.sullivb.exercises09.Matrix;

public class Circle {
    private double radius = 1.0;
    private Matrix pos = Matrix.makePoint2D(0,0);

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
    public String toString() {
        String s = "(Circle)\n";
        s += "radius: " + radius + "\n";
        s += "center:\n";
        s+= pos + "\n";
        return s;
    }
}
