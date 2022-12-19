package edu.umb.cs680.hw11;

import java.util.List;

public class Manhattan implements DistanceMetric
{
    public double distance(List<Double> p1, List<Double> p2)
    {
        double sum = 0;
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
    }
}