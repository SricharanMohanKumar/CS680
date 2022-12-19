package edu.umb.cs680.hw16;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ManhattanDistanceForMultiptidimentionarrayTest {
    private static List<Double> p1, p2, p3, p4, p5;
    private static List<List<Double>> pointsList = new LinkedList<>();

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        p1 = Arrays.asList(4.0, 11.0, 44.0);
        p2 = Arrays.asList(3.0, 10.0, 20.0);
        p3 = Arrays.asList(14.0, 6.0, 9.0);
        p4 = Arrays.asList(7.0, 6.0, 3.0);
        p5 = Arrays.asList(6.0, 4.0, 5.0);
        pointsList.add(p1);
        pointsList.add(p2);
        pointsList.add(p3);
        pointsList.add(p4);
        pointsList.add(p5);
    }

    @Test
    public void distanceTestWithP1P2()
    {
        List<List<Double>> actual = Distance.matrix(pointsList,(List<Double>s1, List<Double>s2) -> {double sumOfCoordinates = 0;
            for (int i = 0; i < s1.size(); i++)
            {
                sumOfCoordinates += Math.abs(s1.get(i) - s2.get(i));
            }
            return sumOfCoordinates;
        });
        List<List<Double>> expected=Arrays.asList(Arrays.asList(0.0, 26.0, 50.0, 49.0, 48.0),Arrays.asList(26.0, 0.0, 26.0, 25.0, 24.0),Arrays.asList(50.0, 26.0, 0.0, 13.0, 14.0),Arrays.asList(49.0, 25.0, 13.0, 0.0, 5.0),Arrays.asList(48.0, 24.0, 14.0, 5.0, 0.0));
        assertEquals(actual,expected);
    }
}