package org.example.models;

public class Voter {
    private int id;
    private String name;
    private VotesCounter counter;
    public Voter(int id, String name, VotesCounter counter) {
        this.id = id;
        this.name = name;
        this.counter = counter;
    }
    public void addVote(Elector elector) {
        counter.addVote(this, elector);
    }
    public String toString() {
        return String.format("Name = %s  id = %d", name, id);
    }
}
