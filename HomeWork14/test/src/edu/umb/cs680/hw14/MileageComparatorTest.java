package edu.umb.cs680.hw14;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MileageComparatorTest {

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
    public void verify_MileageComparator()
    {
        Collections.sort(usedCars,(Car car1, Car car2) -> car2.Mileage()-car1.Mileage());
        assertEquals(60,usedCars.get(0).Mileage());
        assertEquals(50, usedCars.get(1).Mileage());
        assertEquals(30, usedCars.get(2).Mileage());
        assertEquals(30, usedCars.get(3).Mileage());
        assertEquals(23, usedCars.get(4).Mileage());
        assertEquals(15, usedCars.get(5).Mileage());

    }

}