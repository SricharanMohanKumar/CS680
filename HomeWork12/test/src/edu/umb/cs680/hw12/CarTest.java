package edu.umb.cs680.hw12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

    private String[] carToStringArray(Car car) {
        String[] data = {car.Make(),car.Model(),Integer.toString(car.Year())};
        return data;
    }

    @Test
    void verifyCarEqualityWithMakeModelYear() {
        String[] expected = {"Toyota","RAV4","2018"};
        Car actual = new Car("Toyota","RAV4",23,2018,30000);
        assertArrayEquals(expected,carToStringArray(actual));
    }
    @Test
    void verifyCar() {
        Car expected = new Car("Toyota","RAV4",23,2018,30000);
        Car actual = new Car("Toyota","RAV4",23,2018,30000);
        assertArrayEquals(carToStringArray(expected),carToStringArray(actual));
    }

}