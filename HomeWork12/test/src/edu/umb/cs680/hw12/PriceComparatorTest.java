package edu.umb.cs680.hw12;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PriceComparatorTest
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
        // Applying Price Comparator
        Collections.sort(usedCars, new PriceComparator());
    }

    @Test
    public void priceSort() {
        ArrayList<Float> actual = new ArrayList<>();
        ArrayList<Float> expected = new ArrayList<>();

        expected.add(45000f);
        expected.add(40000f);
        expected.add(27000f);
        expected.add(25000f);
        expected.add(15000f);
        expected.add(5000f);

        for (Car c : usedCars)
            actual.add(c.Price());

        assertEquals(actual, expected);
    }
}