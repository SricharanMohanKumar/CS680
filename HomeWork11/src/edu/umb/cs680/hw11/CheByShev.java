package edu.umb.cs680.hw11;

import java.util.List;

public class CheByShev implements DistanceMetric {

    public double distance(List<Double> p1, List<Double> p2)
    {
        double max = 0;
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
    }
}