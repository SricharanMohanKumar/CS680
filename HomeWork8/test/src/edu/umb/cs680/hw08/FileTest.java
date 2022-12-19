package edu.umb.cs680.hw08;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
class FileTest
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
    private String[] FileToStringArray(File F)
    {
        String file[] = {F.getName(), Integer.toString(F.getSize()),F.getParent().getName()};
        return file;
    }
    // name if the file, size of file,parent of the file
    @Test
    public void verifyFileEqualityX()
    {
        String[] expected = {"x","1","Apps"};
        String[] actual = FileToStringArray(x);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void verifyFileEqualityY()
    {
        String expected[] = {"y","1","bin"};
        String[] actual = FileToStringArray(y);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void verifyFileEqualityA()
    {
        String expected[] = {"a", "1", "pictures"};
        String[] actual = FileToStringArray(a);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void verifyFileEqualityB()
    {
        String expected[] = {"b", "1", "pictures"};
        String[] actual = FileToStringArray(b);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void verifyFileEqualityC()
    {
        String expected[] = {"c", "1", "home"};
        String[] actual = FileToStringArray(c);
        assertArrayEquals(expected, actual);
    }
    // test if its a directory
    @Test
    public void FileTestA()
    {
        assertTrue(a.isFile());
    }
    @Test
    public void FileTestB()
    {
        assertTrue(b.isFile());
    }
    @Test
    public void FileTestC()
    {
        assertTrue(c.isFile());
    }
    @Test
    public void FileTestX()
    {
        assertTrue(x.isFile());
    }
    @Test
    public void FileTestY()
    {
        assertTrue(y.isFile());
    }
    @Test
    public void FileTesthome()
    {
        assertFalse(home.isFile());
    }
}