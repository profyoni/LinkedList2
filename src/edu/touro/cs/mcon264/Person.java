package edu.touro.cs.mcon264;

public class Person{
    private String firstName, lastName;

    static private int population; // Class Variable vs instance variable

    public Person()
    {
        Person.population++;
    }

    public static int getPopulation(){return population;}

    protected void finalize() // NOT final, NOT finally
    {
        Person.population--;
    }

}
