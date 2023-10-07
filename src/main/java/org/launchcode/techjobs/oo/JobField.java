package org.launchcode.techjobs.oo;

import java.util.Objects;

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

        if(value==null|| value.equals("")){
            setValue("Data not available");
        }
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

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
