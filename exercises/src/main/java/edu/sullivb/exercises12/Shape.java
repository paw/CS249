package edu.sullivb.exercises12;
import edu.sullivb.exercises09.Matrix;
public class Shape {
    private Matrix center = Matrix.makePoint2D(0,0);
    protected boolean filled = true;

    public Shape() {}

    public Shape(Matrix center) {
        //this.center = new Matrix(center);
        this(center, true);
    }
    public Shape(Matrix center, boolean filled) {
        this.center = new Matrix(center);
        this.filled = filled;
    }

    public double getArea() {
        return 0.0;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public Matrix getCenter() {
        return new Matrix(center);
    }
    public void setCenter(Matrix center) {
        this.center = new Matrix(center);
    }
    @Override // extra error checking; can include when overriding a parent method
    public String toString() {
        String s = "Shape: ";
        s += center.toPoint2DString();
        if (isFilled()) {
            s += ", filled";
        }
        return s;
    }
}
