package edu.sullivb.exercises10;

public class Person {
    private String name = "";
    private boolean alive = true;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean isAlive() {
        return alive;
    }
    public String toString() {
        String s = name;
        if (!isAlive()) {
            s+= " (DECEASED)";
        }
        return s;
    }

    public void die() {
        alive = false;
    }
}
