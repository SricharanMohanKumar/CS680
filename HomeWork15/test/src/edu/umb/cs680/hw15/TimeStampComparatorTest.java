package edu.umb.cs680.hw15;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw15.fs.*;

import static org.junit.jupiter.api.Assertions.*;
public class TimeStampComparatorTest
{
    static LocalDateTime localTime = LocalDateTime.now();
    Directory root = new Directory(null, "root", 0, localTime);
    Directory Apps = new Directory(root, "Apps", 0, localTime);
    Directory bin = new Directory(root, "bin", 0, localTime);
    Directory home = new Directory(root, "home", 0, localTime);
    Directory pictures = new Directory(home, "pictures", 0, localTime);
    File x = new File(Apps, "x", 1, localTime);
    File y = new File(bin, "y", 1, localTime);
    File a = new File(pictures, "a", 1, localTime);
    File b = new File(pictures, "b", 1, localTime);
    File c = new File(home, "c", 1, localTime);
    Link d = new Link(root, "d", 2, localTime, pictures);
    Link e = new Link(root, "e", 2, localTime, x);


    @Test
    public void Test_getChildren() {
        FSElement[] expected = {Apps,bin,d,e,home};
        Directory directory = root;
        List<FSElement> element = directory.getChildren((FSElement obj1, FSElement obj2) -> obj1.getName().compareTo(obj2.getName()));
        assertArrayEquals(expected, element.toArray());
    }
    @Test

    public void Test_getSubDirectories() {
        Directory[] expected = { pictures};
        Directory directory = home;
        List<Directory> element = directory.getSubDirectories((FSElement obj1, FSElement obj2) -> obj1.getName().compareTo(obj2.getName()));
        assertArrayEquals(expected,element.toArray() );
    }

    @Test
    public void Test_getFiles() {
        File[] expected = { a,b};
        Directory directory = pictures;
        List<File> element = directory.getFiles((FSElement obj1, FSElement obj2) -> obj1.getName().compareTo(obj2.getName()));
        assertArrayEquals(expected,element.toArray());
    }
}
