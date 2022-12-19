package edu.umb.cs680.hw16;

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
        double actual = Distance.get(p1,p2,(List<Double>s1, List<Double>s2) -> {double sum = 0;
            double a=0;
            for (int i = 0; i < p1.size(); i++)
            {
                a = p1.get(i) - p2.get(i);
                if( a<0)
                {
                    a=-a;
                }
                sum = sum+a;
            }
            return sum;
        });
        assertEquals(26, actual);
    }
}