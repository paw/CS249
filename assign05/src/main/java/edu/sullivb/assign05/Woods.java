package edu.sullivb.assign05;

import java.util.ArrayList;

public class Woods {

    protected ArrayList<Giant> giants = new ArrayList<>();
    public Giant createGiant(String name, String type) {
        String monster = type.toUpperCase();
        if(name.isEmpty()) {
            return null;
        } else {
            switch (monster) {
                case "GIANT" -> {
                    return new Giant(name);
                }
                case "TROLL" -> {
                    return new Troll(name);
                }
                case "TREE" -> {
                    return new Tree(name);
                }
                case "ENT" -> {
                    return new Ent(name);
                }
                case "HUORN" -> {
                    return new Huorn(name);
                }
                default -> {
                    return null;
                }
            }
        }
    }
    public boolean addGiant(String name, String type) {
        Giant g = createGiant(name, type);
        if (g != null) {
            giants.add(g);
            return true;
        } else { // giant is null
            return false;
        }
    }
    public Giant getGiant(int index) {
        if (index >= 0 && index < giants.size()) {
            return giants.get(index);
        } else {
            return null;
        }
    }
    public void printAllGiants() {
        StringBuilder sb = new StringBuilder();
        sb.append("ALL GIANTS:");
        for (Giant g : giants) {
            sb.append("\n- ").append(g);
        }
        System.out.println(sb);
    }
    public void printAllTrees() {
        StringBuilder sb = new StringBuilder();
        sb.append("ALL TREES:");
        for (Giant g : giants) {
            if(g instanceof Tree) {
                sb.append("\n- ").append(g);
                sb.append(": ").append(((Tree) g).speak()); // must cast to tree to speak
            }
        }
        System.out.println(sb);
    }
    public void printAllTrolls() {
        StringBuilder sb = new StringBuilder();
        sb.append("ALL TROLLS:");
        for (Giant g : giants) {
            if(g instanceof Troll) {
                sb.append("\n- ").append(g);
                sb.append(": ").append(((Troll) g).cook()); // must cast to troll to cook
            }
        }
        System.out.println(sb);
    }
}

