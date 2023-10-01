package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job job1=new Job();
        Job job2=new Job();
        assertNotEquals(job1,job2);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job1=new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(job1.getEmployer());

        assertEquals(job1.getName(),"Product tester");
        assertEquals("ACME",job1.getEmployer().toString());
        assertEquals("Desert",job1.getLocation().toString());
        assertEquals("Quality control",job1.getPositionType().toString());
        assertEquals("Persistence",job1.getCoreCompetency().toString());

        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(job1.getLocation() instanceof Location);
    }
    @Test
    public void testJobsForEquality(){
        Job job1=new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2=new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job1=new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(job1.toString());
       assertTrue(job1.toString().startsWith(System.lineSeparator()));
       assertTrue(job1.toString().endsWith(System.lineSeparator()));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job1=new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Map<String, String> myMap = new HashMap<>();
        String[] pairs = job1.toString().split(System.lineSeparator());
        for (int i=1;i<pairs.length;i++) {
            System.out.println(pairs[i]);
            String pair = pairs[i];
            String[] keyValue = pair.split(":");
            myMap.put(keyValue[0], String.valueOf(keyValue[1]));
        }
        System.out.println(myMap);
        assertEquals("Product tester",myMap.get("Name").trim());
        assertEquals("ACME",myMap.get("Employer").trim());
        assertEquals("Desert",myMap.get("Location").trim());
        assertEquals("Quality control",myMap.get("Position Type").trim());
        assertEquals("Persistence",myMap.get("Core Competency").trim());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job job1=new Job(null, null, null,
                null, null);
        Map<String, String> myMap = new HashMap<>();
        System.out.println(job1+"***************");
        String[] pairs = job1.toString().split(System.lineSeparator());

        for (int i=1;i<pairs.length;i++) {
            System.out.println(pairs[i]);
            String pair = pairs[i];
            String[] keyValue = pair.split(":");
            myMap.put(keyValue[0], String.valueOf(keyValue[1]));
        }
        assertEquals("Data not available",myMap.get("Core Competency").trim());
        assertEquals("Data not available",myMap.get("Name").trim());
        assertEquals("Data not available",myMap.get("Employer").trim());
        assertEquals("Data not available",myMap.get("Location").trim());
        assertEquals("Data not available",myMap.get("Position Type").trim());

    }
}
