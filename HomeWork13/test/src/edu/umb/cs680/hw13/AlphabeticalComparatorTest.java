package edu.umb.cs680.hw13;
import edu.umb.cs680.hw13.fs.Directory;
import java.time.LocalDateTime;
import java.util.List;
import edu.umb.cs680.hw13.fs.File;
import edu.umb.cs680.hw13.fs.Link;
import edu.umb.cs680.hw13.fs.*;
import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw13.fs.*;

import static org.junit.jupiter.api.Assertions.*;

class AlphabeticalComparatorTest {

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
        List<FSElement> element = directory.getChildren(new AlphabeticalComparator());
        assertArrayEquals(expected, element.toArray());
    }

    @Test
    public void Test_getSubDirectories() {
        Directory[] expected = {pictures};
        Directory directory = home;
        List<Directory> element = directory.getSubDirectories(new AlphabeticalComparator());
        assertArrayEquals(expected, element.toArray());
    }

    @Test
    public void TestgetFiles() {
        File[] expected = {a,b};
        Directory directory = pictures;
        List<File> element = directory.getFiles(new AlphabeticalComparator());
        assertArrayEquals(expected, element.toArray());
    }
    @Test
    public void TestgetFilesiffalse() {
        File[] expected = {b,a};
        Directory directory = pictures;
        List<File> element = directory.getFiles(new AlphabeticalComparator());
        assertNotEquals(expected, element.toArray());
    }
}
