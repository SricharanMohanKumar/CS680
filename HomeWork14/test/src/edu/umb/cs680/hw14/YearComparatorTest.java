package edu.umb.cs680.hw14;
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

    }
    @Test
    public void verify_YearComparator()
    {
        Collections.sort(usedCars, (Car car1, Car car2) ->  (car2.Year() - car1.Year()));
        assertEquals(2021,usedCars.get(0).Year());
        assertEquals(2020, usedCars.get(1).Year());
        assertEquals(2018, usedCars.get(2).Year());
        assertEquals(2016, usedCars.get(3).Year());
        assertEquals(2015, usedCars.get(4).Year());
        assertEquals(2013, usedCars.get(5).Year());

    }
}