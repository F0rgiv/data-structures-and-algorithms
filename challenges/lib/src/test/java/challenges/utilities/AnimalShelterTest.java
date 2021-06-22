package challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test
    public void animalShelter() throws Exception {
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(new Dog("dog1"));
        animalShelter.enqueue(new Dog("dog2"));
        animalShelter.enqueue(new Dog("dog3"));
        animalShelter.enqueue(new Cat("cat1"));
        animalShelter.enqueue(new Cat("cat2"));
        animalShelter.enqueue(new Cat("cat3"));

        assertEquals("dog1", animalShelter.dequeue("dog").name);
        assertEquals("dog2", animalShelter.dequeue("dog").name);
        assertTrue(animalShelter.dequeue("cat") instanceof Cat);
        assertTrue(animalShelter.dequeue("") instanceof Dog);
        assertTrue(animalShelter.dequeue("") instanceof Cat);
        assertEquals("cat3", animalShelter.dequeue("cat").name);
    }
}