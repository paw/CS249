package edu.sullivb.assign05;

public class Ent extends Tree {
    public Ent(String name) { super(name); }
    public String speak() {
        return "HOOM";
    }
    public String toString() {
        return "Ent " + super.toString();
    }
}
