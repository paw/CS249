package edu.sullivb.assign06;

import java.util.Scanner;

public class Item implements Loadable {
    private String ID = "";
    private int value = 0;
    public Item() {}
    public Item(String ID, int value) {
        setID(ID);
        setValue(value);
    }
    public int getValue() {
        return value;
    }
    public String getID() {
        return ID;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String toString() {
        return ID + " with value " + value;
    }
    public void load(Scanner input) throws GameFileException {
        try {
            setID(input.next());
            setValue(input.nextInt());
        } catch (Exception e) {
            setID("");
            setValue(0);
            throw new GameFileException("Error loading Item", e);
        }
    }
}
