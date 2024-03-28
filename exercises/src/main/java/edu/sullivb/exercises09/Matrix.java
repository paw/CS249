package edu.sullivb.exercises09;
import java.util.*;
public class Matrix {
    private double [][] m;

    public Matrix(int rowCnt, int colCnt) {
        m = new double [rowCnt][colCnt];
    }
    public Matrix(Matrix other) {
        m = new double[other.getRowCount()][other.getColCnt()];
        for(int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = other.m[i][j];
            }
        }
    }

    public int getRowCount() {
        return m.length;
    }
    public int getColCnt() {
        return m[0].length;
    }

    public boolean isValidPosition(int r, int c) {
        return (
                r >= 0 &&
                c >= 0 &&
                r < getRowCount() &&
                c < getColCnt()
        );
    }
    public double get(int r, int c) {
        if (isValidPosition(r,c)) {
            return m[r][c];
        } else {
            System.err.println("ERROR: out of bounds.");
            return 0.0;
        }
    }
    public void set(int r, int c, double val) {
        if (isValidPosition(r,c)) {
            m[r][c] = val;
        } else {
            System.err.println("ERROR: out of bounds.");
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < getRowCount(); row++) {
            for(int col = 0; col < getColCnt(); col++) {
                sb.append(m[row][col]);
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String toPoint2DString() {
        return "(" + m[0][0] + ", " + m[1][0] + ")";
    }
    public String toRGBAString() {
        return "rgba(" + m[0][0] + ", " + m[1][0] + ", " + m[2][0] + ", " + m[3][0] + ")";
    }
    public boolean equals(Object other) {
        boolean same = false;
        if (other instanceof Matrix otherM) {
            if(this.getRowCount() == otherM.getRowCount() && this.getColCnt() == otherM.getColCnt()) {

                final double EPS = 1e-10;
                boolean valuesSame = true;
                for (int r = 0; r < getRowCount(); r++) {
                    for(int c = 0; c < getColCnt(); c++) {
                        if (Math.abs(m[r][c] - otherM.m[r][c]) > EPS) {
                            valuesSame = false;
                            break;
                        }
                    }
                }
                same = valuesSame;
            }
        }
        return same;
    }

    public Matrix multiply(Matrix other) {
        if (getColCnt() != other.getRowCount()) {
            System.err.println("Cannot multiply.");
            return null; // risky but can be done when returning an obj
        } else {
            Matrix r = new Matrix(getRowCount(), other.getColCnt());
            for (int i = 0; i < r.getRowCount(); i++) {
                for (int j = 0; j < r.getColCnt(); j++) {
                    // r[i][j]
                    for (int k = 0; k < getColCnt(); k++) {
                        double val = get(i,k) * other.get(k,j);
                        r.set(i,j, r.get(i,j) + val);
                    }
                }
            }
            return r;
        }
    }

    public static Matrix makePoint2D(double x, double y) {
        Matrix v = new Matrix(3,1);
        v.set(0,0,x);
        v.set(1,0,y);
        v.set(2,0,1);
        return v;
    }
    public static Matrix makePoint3D(double x, double y, double z) {
        Matrix v = new Matrix(4, 1);
        v.set(0,0, x);
        v.set(1,0, y);
        v.set(2, 0, z);
        v.set(3, 0, 1);
        return v;
    }

    public String getOBJVertexString() {
        return "v "
                + get(0,0) + " "
                + get(1,0) + " "
                + get(2,0);
    }
    public static Matrix makeRGBA(double r, double g, double b, double a) {
        Matrix v = new Matrix(4,1);
        v.set(0,0,r);
        v.set(1,0,g);
        v.set(2,0,b);
        v.set(3,0,a);
        return v;
    }
    public static Matrix makeTranslation2D(double tx, double ty) {
        Matrix m = new Matrix(3,3);
        m.set(0,0,1);
        m.set(1,1,1);
        m.set(2,2,1);
        m.set(0,2,tx);
        m.set(1,2,ty);
        return m;
    }
    public static Matrix makeScaling3D(double sx, double sy, double sz) {
        Matrix m = new Matrix(4,4);
        m.set(0,0,sx);
        m.set(1,1,sy);
        m.set(2,2,sz);
        m.set(3,3,1);
        return m;
    }
    public static Matrix makeRotationZ3D(double angle) {
        Matrix m = new Matrix(4,4);
        double rad = Math.toRadians(angle);
        m.set(0,0,Math.cos(rad));
        m.set(0,1,-Math.sin(rad));

        m.set(1,0,Math.sin(rad));
        m.set(1,1,Math.cos(rad));

        m.set(2,1,1);
        m.set(2,2,1);
        return m;
    }
}
