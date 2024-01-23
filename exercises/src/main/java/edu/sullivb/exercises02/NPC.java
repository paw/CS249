package edu.sullivb.exercises02;

public class NPC {
    private String name = "Cannon Fodder";
    private int health = 100;

    public NPC() {}
    public NPC(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int h) {
        if (h < 0) {
            health = 0;
        } else if (h > 100) {
            health = 100;
        } else {
            health = h;
        }
    }


}
