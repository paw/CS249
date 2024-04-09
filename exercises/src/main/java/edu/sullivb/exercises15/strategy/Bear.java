package edu.sullivb.exercises15.strategy;

public abstract class Bear {
    protected Moveable moveBehavior;

    protected Bear(Moveable m) {
        moveBehavior = m;
    }
    public void performMove() {
        moveBehavior.move();
    }
    public void setMoveBehavior(Moveable m) {
        moveBehavior = m;
    }
    public abstract void draw();
}
