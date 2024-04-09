package edu.sullivb.exercises15.strategy;

public class TeddyBear extends Bear {

    public TeddyBear() {
        super(new NoMove());
    }
    @Override
    public void draw() {
        System.out.println("TEDDY BEAR");
    }
}
