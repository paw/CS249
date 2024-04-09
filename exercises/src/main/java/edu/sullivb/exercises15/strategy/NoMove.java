package edu.sullivb.exercises15.strategy;

public class NoMove implements  Moveable {
    public void move() {
        System.out.println("It doesn't move.");
    }
}
