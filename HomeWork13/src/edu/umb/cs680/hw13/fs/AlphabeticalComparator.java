package edu.umb.cs680.hw13.fs;


import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<FSElement> {

    public int compare(FSElement apfsElement1, FSElement apfsElement2)
    {
        return apfsElement1.getName().compareTo(apfsElement2.getName());
    }


}
