package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public  Job(){
        id=nextId;
        nextId++;
    }
    public Job(String name,Employer employer,Location location,PositionType positionType ,CoreCompetency coreCompetency){
        this();
        this.name=name;
        this.employer=employer;
        this.location=location;
        this.positionType=positionType;
        this.coreCompetency=coreCompetency;
    }
    @Override
    public String toString(){
        String coreCompetnecy1="";
        if(this.getCoreCompetency()==(null)){
        coreCompetnecy1="Data not available";
            System.out.println("If Conditions***********");
        }
        else{ System.out.println("Else Conditions***********");
            coreCompetnecy1=this.getCoreCompetency().toString();
        }
        String name="";
        if(this.getName()==(null)){
            name="Data not available";
            System.out.println("If Conditions***********");
        }
        else{
            name=this.getName().toString();
        }

        String employer="";
        if(this.getEmployer()==(null)){
            employer="Data not available";
            System.out.println("If Conditions***********");        }
        else {
            employer=this.getEmployer().toString();

        }
        String location="";
        if(this.getLocation()==(null)){
         location="Data not available";
        }
        else{
            location=this.getLocation().toString();
        }
        String position="";
        if(this.getPositionType()==(null)){
            position="Data not available";
        }
        else{
            position=this.getPositionType().toString();
        }


        return System.lineSeparator()+"Id: "+this.getId()+System.lineSeparator()+"Name: "+name+System.lineSeparator()+"Employer: "+employer
                +System.lineSeparator()+"Location: "+location+System.lineSeparator()+"Position Type: "+
                position+System.lineSeparator()+"Core Competency: "+coreCompetnecy1+System.lineSeparator();
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Job job)) return false;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
