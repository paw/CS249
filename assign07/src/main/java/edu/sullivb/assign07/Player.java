package edu.sullivb.assign07;
import edu.sullivb.assign06.Creature;
import edu.sullivb.assign04.GameBoard;

public class Player extends Creature {
    public Player() {}
    public Player(int row, int col) {
        super(row, col);
    }
    public String toString() {
        return "Player at " + getRow() + "," + getCol();
    }
    public void draw(GameBoard map) {
        map.setPos(getRow(),getCol(),'P');
    }
}
