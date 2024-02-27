package edu.sullivb.exercises12;
import edu.sullivb.exercises09.Matrix;
public class Shape {
    private Matrix center = Matrix.makePoint2D(0,0);
    protected boolean filled = true;

    private Matrix fillColor = Matrix.makeRGBA(255,255,255,1);
    private Matrix lineColor = Matrix.makeRGBA(0,0,0,1);
    private double lineWidth = 1.0;

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
    public void setFillColor(Matrix fillColor) { this.fillColor = new Matrix(fillColor);}
    public void setLineColor(Matrix lineColor) { this.fillColor = new Matrix(lineColor);}
    public void setLineWidth(double lineWidth) { this.lineWidth = lineWidth;}
    public Matrix getCenter() {
        return new Matrix(center);
    }
    public Matrix getFillColor() { return new Matrix(fillColor); }
    public Matrix getLineColor() { return new Matrix(lineColor); }

    public double getLineWidth() { return lineWidth; }

    public void setCenter(Matrix center) {
        this.center = new Matrix(center);
    }
    @Override // extra error checking; can include when overriding a parent method
    public String toString() {
        String s = "Shape: ";
        s += center.toPoint2DString();
        s+= ", Outline: " + getLineWidth() + "px " + getLineColor().toRGBAString();
        if (isFilled()) {
            s += ", Fill: " + getFillColor().toRGBAString();
        } else { s+= ", No Fill"; }
        return s;
    }
    @Override
    public boolean equals(Object other) {
        boolean same = false;
        if(other instanceof Shape otherS) {
            if (filled == otherS.filled) {

            }
        }
        return same;
    }
}
