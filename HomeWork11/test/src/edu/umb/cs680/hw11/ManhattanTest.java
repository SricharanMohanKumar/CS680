package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;


public class ManhattanTest
{
    @Test
    public void distanceTestWithP1P2()
    {
        List<Double> p1 = Arrays.asList(4.0, 11.0, 44.0);
        List<Double> p2 = Arrays.asList(3.0, 10.0, 20.0);
        double actual = new Manhattan().distance(p1, p2);
        assertEquals(26, actual);
    }
}