package edu.umb.cs680.hw16;
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
        double actual = Distance.get(p1,p2,(List<Double>s1, List<Double>s2) -> {double max = 0;
            for (int i = 0; i < p1.size(); i++)
            {
                double temp = 0;
                temp = p1.get(i) - p2.get(i);
                if( temp<0)
                {
                    temp=-temp;
                }
                if(temp > max)
                {
                    max = temp;
                }
            }
            return max;
        });
        assertEquals(expected, actual);
    }
}