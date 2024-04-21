package edu.sullivb.assign07;

import edu.sullivb.assign04.GameBoard;
import edu.sullivb.assign06.Creature;

public class Orc extends Creature implements Mover {
    private MoveAlgorithm movement = new SeekPlayer();
    public Orc() {}
    public Orc(int row, int col) {
        super(row, col);
    }
    public String toString() {
        return "Orc at " + getRow() + "," + getCol();
    }
    public void draw(GameBoard map) {
        map.setPos(getRow(),getCol(),'O');
    }
    public void performMove(Player p) {
        movement.move(this, p);
    }
}
