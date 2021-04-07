package challenges.utilities;

import java.sql.Timestamp;

public class Animal {
    String name;
    long timePlacedInShelter;

    public String getName() { return name; }

    public Animal(String name) {
        this.name = name;
    }

    public void MarkInShelter(){
        timePlacedInShelter = new Timestamp(System.currentTimeMillis()).getTime();
    }
}
