package edu.sullivb.exercises15.Observer;
import java.util.*;

public class Batsignal implements Subject {
    private String activeCrime = "";
    private ArrayList<Observer> obsList = new ArrayList<Observer>();
    public void registerObserver(Observer obs) {
        obsList.add(obs);
    }
    public void removeObserver(Observer obs) {
        obsList.remove(obs);
    }
    public void notifyObservers() {
        for (Observer obs : obsList) {
            obs.update(this);
        }
    }
    public void setActiveCrime(String crime) {
        activeCrime = crime;
        notifyObservers();
    }
    public void getActiveCrime() {
        
    }
}
