package edu.umb.cs680.hw08;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
class DirectoryTest
{
    static LocalDateTime localTime = LocalDateTime.now();

    static Directory root;
    static Directory Apps;
    static Directory bin;
    static Directory home;
    static Directory pictures;
    static File x;
    static File y;
    static File a;
    static File b;
    static File c;
    static Link d;
    static Link e;


    @BeforeAll
    static void setUpBeforeClass()
    {
        root = new Directory(null,"root",0, localTime);
        Apps = new Directory(root,"Apps",0, localTime);
        bin = new Directory(root,"bin",0, localTime);
        home = new Directory(root,"home",0, localTime);
        pictures = new Directory(home,"pictures",0, localTime);
        x = new File(Apps,"x",1,localTime);
        y = new File(bin,"y",1,localTime);
        a = new File(pictures,"a",1,localTime);
        b = new File(pictures,"b",1,localTime);
        c = new File(home,"c",1,localTime);
        d = new Link(root,"d",2,localTime,pictures);
        e = new Link(root,"e",2,localTime,x);
    }

    private String[] dirToStringArray(Directory d)
    {
        Optional<Directory> optionalDirectory = Optional.ofNullable(d.getParent());
        String[] dirInfo = {d.getName(), Integer.toString(d.getSize()),optionalDirectory.isPresent()?d.getParent().getName():null};
        return dirInfo;
    }
    @Test
    public void verifyDirectoryEqualityRoot()
    {
        String expected[] = {"root", "0",null};
        String[] actual = dirToStringArray(root);
        assertArrayEquals(expected,actual);
    }
    // name if the directory, size of directory, parent
    @Test
    public void verifyDirectoryEqualityHome()
    {
        String[] expected = {"home","0","root"};
        String[] actual = dirToStringArray(home);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void verifyDirectoryEqualityApps()
    {
        String expected[] = {"Apps", "0","root"};
        String[] actual = dirToStringArray(Apps);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void verifyDirectoryEqualityPicture()
    {
        String expected[] = {"pictures", "0", "home"};
        String[] actual = dirToStringArray(pictures);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void verifyDirectoryEqualitybin()
    {
        String expected[] = {"bin", "0", "root"};
        String[] actual = dirToStringArray(bin);
        assertArrayEquals(expected,actual);
    }
    // test if its a directory
    @Test
    public void DirectoryTestApps()
    {
        assertTrue(Apps.isDirectory());
    }
    @Test
    public void DirectoryTestA()
    {
        assertFalse(a.isDirectory());
    }
    @Test
    public void DirectoryTestroot()
    {
        assertTrue(root.isDirectory());
    }
    @Test
    public void DirectoryTesthome()
    {
        assertTrue(home.isDirectory());
    }
    @Test
    public void DirectoryTestpicture()
    {
        assertTrue(pictures.isDirectory());
    }
    @Test
    public void DirectoryTestB()
    {
        assertFalse(b.isDirectory());
    }
    // Count the number of child nodes
    @Test
    public void subFilescountroot()
    {
        assertEquals(5,root.countChildren());
    }
    @Test
    public void subFilescountpictures()
    {
        assertEquals(2,pictures.countChildren());
    }
    @Test
    public void subFilescountApps()
    {
        assertEquals(1,Apps.countChildren());
    }
    @Test
    public void subFilescounthome()
    {
        assertEquals(2,home.countChildren());
    }
    @Test
    public void subFilescountbin()
    {
        assertEquals(1,bin.countChildren());
    }
}