package edu.sullivb.exercises15.strategy;

public class BearSimulator {
    public static void main(String [] args) {
        Bear polar = new PolarBear();
        Bear pooh = new TeddyBear();
        polar.draw();
        polar.performMove();
        pooh.draw();
        pooh.performMove();
        polar.setMoveBehavior(new MoveWithTwoLegs());
        polar.draw();
        polar.performMove();
    }
}
