package edu.umb.cs680.hw11;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
public class CheByShevTest
{
    @Test
    public void distanceTestWithP1P2()
    {
        List<Double> p1 = Arrays.asList(1.0, 7.0, 14.0);
        List<Double> p2 = Arrays.asList(3.0, 6.0, 9.0);
        double expected = 5;
        double actual = new CheByShev().distance(p1, p2);
        assertEquals(expected, actual);
    }
}