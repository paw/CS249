package edu.sullivb.exercises12;
import java.util.*;
public class SystemInputSingleton {

    private static SystemInputSingleton instance;

    public static SystemInputSingleton getInstance() {
        if (instance == null) {
            instance = new SystemInputSingleton();
            // could be issue wrt multi threading
        }
        return instance;
    }

    private SystemInputSingleton() {}

    private Scanner input = new Scanner(System.in);

    public Scanner getScanner() {
        return input;
    }
}
