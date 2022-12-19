package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DistanceTest {
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
    public void verifyManhattanWithPointsList()
    {
        List<List<Double>> expected=Arrays.asList(Arrays.asList(0.0, 26.0, 50.0, 49.0, 48.0),Arrays.asList(26.0, 0.0, 26.0, 25.0, 24.0),
                Arrays.asList(50.0, 26.0, 0.0, 13.0, 14.0),Arrays.asList(49.0, 25.0, 13.0, 0.0, 5.0),Arrays.asList(48.0, 24.0, 14.0, 5.0, 0.0));

        List<List<Double>> actual=Distance.matrix(pointsList,new Manhattan());
        assertEquals(actual,expected);

    }

    @Test
    public void verifyEuclideanWithPointsList()
    {
        List<List<Double>> expected=Arrays.asList(Arrays.asList( 0.0, Math.sqrt(578.0), Math.sqrt(1350.0), Math.sqrt(1715.0), Math.sqrt(1574.0)),
                Arrays.asList(Math.sqrt(578.0), 0.0, Math.sqrt(258.0), Math.sqrt(321.0), Math.sqrt(270.0)),
                Arrays.asList(Math.sqrt(1350.0), Math.sqrt(258.0), 0.0, Math.sqrt(85.0), Math.sqrt(84.0) ),
                Arrays.asList(Math.sqrt(1715.0), Math.sqrt(321.0), Math.sqrt(85.0), 0.0, Math.sqrt(9.0)),
                Arrays.asList(Math.sqrt(1574.0), Math.sqrt(270.0), Math.sqrt(84.0), Math.sqrt(9.0), Math.sqrt(0.0)));

        List<List<Double>> actual=Distance.matrix(pointsList,new Euclidean());
        assertEquals(actual,expected);
    }

    @Test
    public void DistanceMatrixWithPointsList() {
        Double[][] expected = { { 0.0, Math.sqrt(578.0), Math.sqrt(1350.0), Math.sqrt(1715.0), Math.sqrt(1574.0) },
                { Math.sqrt(578.0), 0.0, Math.sqrt(258.0), Math.sqrt(321.0), Math.sqrt(270.0) },
                { Math.sqrt(1350.0), Math.sqrt(258.0), 0.0, Math.sqrt(85.0), Math.sqrt(84.0) },
                { Math.sqrt(1715.0), Math.sqrt(321.0), Math.sqrt(85.0), 0.0, Math.sqrt(9.0) },
                { Math.sqrt(1574.0), Math.sqrt(270.0), Math.sqrt(84.0), Math.sqrt(9.0), Math.sqrt(0.0) } };
        List<List<Double>> actual = Distance.matrix(pointsList);
        for (int i = 0; i < expected.length; i++) {
            Double[] temp = new Double[5];
            assertArrayEquals(expected[i], actual.get(i).toArray(temp));
        }
    }
}