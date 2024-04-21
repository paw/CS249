package edu.sullivb.assign07;

import edu.sullivb.assign06.Creature;
import edu.sullivb.assign04.GameBoard;

public class Bat extends Creature implements Mover {
    private MoveAlgorithm move = new AvoidPlayer();
    public Bat() {}
    public Bat(int row, int col) {
        super(row, col);
    }
    public String toString() {
        return "Bat at " + getRow() + "," + getCol();
    }
    public void draw(GameBoard map) {
        map.setPos(getRow(),getCol(),'B');
    }
}
