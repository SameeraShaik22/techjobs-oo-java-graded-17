package org.launchcode.techjobs.oo;

import org.junit.Test;

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
}
