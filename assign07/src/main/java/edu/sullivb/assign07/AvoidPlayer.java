package edu.sullivb.assign07;

import edu.sullivb.assign06.Creature;

public class AvoidPlayer implements MoveAlgorithm {
    public void move(Creature current, Player p) {
        int rowDiff = p.getRow() - current.getRow();
        int colDiff = p.getCol() - current.getCol();

        // we only do stuff if the creature isn't on top of the player
        if(rowDiff != 0 || colDiff != 0) {
            // if the row difference is greater than the column difference...
            // we move the creature up or down (ROWS)
            if (Math.abs(rowDiff) > Math.abs(colDiff)) {
                if (rowDiff < 0) {
                    //player is north (negative), run away south!
                    current.setRow(current.getRow()+1);
                } else {
                    //player is south (positive), run away north!
                    current.setRow(current.getRow()-1);
                }
            } else {
                // otherwise we move left or right (COL)
                if (colDiff < 0) {
                    //player is west (negative), run away east!
                    current.setCol(current.getCol()+1);
                } else {
                    //player is east (positive), run away west!
                    current.setCol(current.getCol()-1);
                }
            }
        }
        // no else statement. we do nothing bc the creature MUST be on top of the player
    }
}
