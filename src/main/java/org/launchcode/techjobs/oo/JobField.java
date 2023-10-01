package org.launchcode.techjobs.oo;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

public  JobField(String value){
    id = nextId;
    nextId++;
    this.value=value;
}
    @Override
    public String toString() {
        return value;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public int getId() {
        return id;
    }
}
