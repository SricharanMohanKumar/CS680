package edu.umb.cs680.hw12;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class YearComparatorTest
{
    static ArrayList<Car> usedCars = new ArrayList<>();

    @BeforeAll
    public static void testSetup() {

        usedCars.add(new Car("A5", "Audi", 30, 2021, 40000));
        usedCars.add(new Car("Accord", "Honda", 50, 2016, 27000));
        usedCars.add(new Car("320x", "mazda", 30, 2018, 45000));
        usedCars.add(new Car("Ertiga", "MarathuSuzuki", 15, 2020, 25000));
        usedCars.add(new Car("EcoSport", "Ford", 23, 2013, 15000));
        usedCars.add(new Car("Rav 4", "Toyota", 60, 2015, 5000));

        // Applying Year Comparator Logic
        Collections.sort(usedCars, new YearComparator());
    }

    @Test
    public void yearSort() {
        ArrayList<Integer> actual = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();

        expected.add(2021);
        expected.add(2020);
        expected.add(2018);
        expected.add(2016);
        expected.add(2015);
        expected.add(2013);

        for (Car c : usedCars)
            actual.add(c.Year());

        assertEquals(actual, expected);
    }

}