package edu.sullivb.exercises09;

public class MatrixLand {
    public static void main(String [] args) {
        Matrix m = new Matrix(4,3);
        m.set(0,2,45);
        System.out.println(m);

        Matrix v = Matrix.makePoint2D(5,4);
        Matrix T = Matrix.makeTranslation2D(10,-25);

        Matrix w = T.multiply(v);
        System.out.println("V:\n" + v);
        System.out.println("T:\n" + T);
        System.out.println("W:\n" + w);
    }
}
