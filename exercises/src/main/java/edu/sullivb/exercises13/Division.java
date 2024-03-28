package edu.sullivb.exercises13;
import java.util.*;
import java.io.*;
public class Division {
    public static int quotient(int a, int b) throws IOException {
        if (b == 0) {
            throw new ArithmeticException("YOU FOOL!");
        }
        if (a % b != 0) {
            throw new IOException("You can't have a remainder of " + a % b + "!");
        }
        int res = a / b;
        return res;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        try {
            int x = input.nextInt();
            int y = input.nextInt();
            int z = quotient(x, y);
            System.out.println("Ans: " + z);
        }
        catch(ArithmeticException e) {
            System.out.println("** ALERT!!!!!!!!!! **************");
            System.err.println(e.getMessage());
        }
        /*catch(InputMismatchException e) {
            System.err.println("Numbers only bro, cmon.");
        }*/
        catch(IOException e) {
            System.err.println("NOT a good example of an IOException.");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        catch(Exception e) {
            System.err.println("Something WEIRD happened.");
            System.err.println(e.getMessage());
        }
        System.out.println("Program complete.");
    }
}
