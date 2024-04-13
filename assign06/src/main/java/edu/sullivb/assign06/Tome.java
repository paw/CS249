package edu.sullivb.assign06;

import java.util.Scanner;

public class Tome extends Item {
    private String skill = "";

    public Tome() {}

    public Tome(String ID, int value, String skill) {
        super(ID, value);
        setSkill(skill);
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    public String getSkill() {
        return skill;
    }
    public void read() {
        System.out.println("Skill " + getSkill() + " increased!");
    }
    public String toString() {
        return super.toString() + ", enhances " + getSkill();
    }
    public void load(Scanner input) throws GameFileException {
        try {
            super.load(input);
            setSkill(input.next());
        } catch (Exception e) {
            setID("");
            setValue(0);
            setSkill("");
            throw new GameFileException("Error loading Tome", e);
        }
    }
}
