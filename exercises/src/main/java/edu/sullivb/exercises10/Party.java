package edu.sullivb.exercises10;

public class Party {
    private Person [] people;

    public Party(String [] names) {
        people = new Person[names.length];
        for(int i = 0; i < people.length; i++) {
            people[i] = new Person(names[i]);
        }
    }
    public Person getMember(String name) {
        for (Person p: people) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        System.err.println(name + " is not in your party!");
        return null;
    }
    public Person getMemberByIndex(int index) {
        return people[index];
    }
    public int partyCount() {
        return people.length;
    }
    public String isDead() {
        StringBuilder sb = new StringBuilder();
        sb.append("PARTY (DEAD):\n");
        for (Person p: people) {
            if (!p.isAlive()) {
                sb.append("* ");
                sb.append(p);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PARTY OF " + partyCount() + ":\n");
        for(Person p: people) {
            sb.append("* ");
            sb.append(p);
            sb.append("\n");
        }
        return sb.toString();
    }
}
