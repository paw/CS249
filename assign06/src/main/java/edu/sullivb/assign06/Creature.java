package edu.sullivb.assign06;

import java.util.Scanner;

public abstract class Creature implements Loadable, Drawable {
    private int col;
    private int row;

    protected Creature() {
        setRow(0);
        setCol(0);
    }
    protected Creature(int row, int col) {
        setRow(row);
        setCol(col);
    }
    public int getCol() {
        return col;
    }
    public int getRow() {
        return row;
    }
    public void setCol(int col) {
        this.col = col;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public void load(Scanner input) throws GameFileException {
        try {
            setRow(input.nextInt());
            setCol(input.nextInt());
        } catch (Exception e) {
            setRow(0);
            setCol(0);
            throw new GameFileException("Error loading Creature", e);
        }
    }
}
