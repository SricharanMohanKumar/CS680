package edu.umb.cs680.hw12;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParetoComparatorTest {

    static ArrayList<Car> usedCars = new ArrayList<>();

    @BeforeAll
    public static void testSetup() {
        usedCars.add(new Car("A5", "Audi", 30, 2021, 40000));
        usedCars.add(new Car("Accord", "Honda", 50, 2016, 27000));
        usedCars.add(new Car("320x", "mazda", 30, 2018, 45000));
        usedCars.add(new Car("Ertiga", "MarathuSuzuki", 15, 2020, 25000));
        usedCars.add(new Car("EcoSport", "Ford", 23, 2013, 15000));
        usedCars.add(new Car("Rav 4", "Toyota", 60, 2015, 5000));
    }

    @Test
    public void paretoSort() {
        ArrayList<Integer> actual = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        usedCars.add(new Car("A5", "Audi", 30, 2021, 40000));
        usedCars.add(new Car("Accord", "Honda", 50, 2016, 27000));
        usedCars.add(new Car("320x", "mazda", 30, 2018, 45000));
        usedCars.add(new Car("Ertiga", "MarathuSuzuki", 15, 2020, 25000));
        usedCars.add(new Car("EcoSport", "Ford", 23, 2013, 15000));
        usedCars.add(new Car("Rav 4", "Toyota", 60, 2015, 5000));
        for (int j = 0; j < 6; j++) {
            usedCars.get(j).setCars(usedCars);
            int a = usedCars.get(j).dominationCount();
            expected.add(a);

        }
        Collections.sort(usedCars, new ParetoComparator());

        for (int j = 0; j < 6; j++)
        {
            actual.add(usedCars.get(j).getDominationCount());
            Collections.sort(usedCars, new ParetoComparator());
        }
        assertEquals(expected, actual);
    }

}