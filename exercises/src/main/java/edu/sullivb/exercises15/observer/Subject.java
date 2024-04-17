package edu.sullivb.exercises15.observer;

public interface Subject {
    void registerObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();
}
