package edu.sullivb.exercises14;

public class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "cook";
    }
    @Override
    public String makeNoise() {
        return "BWAKK";
    }
}
