package org.example.models;

public class Elector {

    private int id;
    private String name;

    public Elector(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
    public String toString() {
        return String.format("id = %d Name = %s, ", id, name);

    }
}
