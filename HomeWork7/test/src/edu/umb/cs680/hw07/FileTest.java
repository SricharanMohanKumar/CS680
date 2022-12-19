package edu.umb.cs680.hw07;
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
    static Directory lib;
    static Directory home;
    static Directory code;
    static File x;
    static File y;
    static File z;
    static File a;
    static File b;
    static File c;
    static File d;

    @BeforeAll
    static void setUpBeforeClass()
    {
        root = new Directory(null,"root",0, localTime);
        Apps = new Directory(root,"Apps",0, localTime);

        lib = new Directory(root,"lib",0, localTime);
        home = new Directory(root,"home",0, localTime);
        code = new Directory(home,"code",0, localTime);
        x = new File(Apps,"x",1,localTime);
        y = new File(Apps,"y",1,localTime);
        z = new File(lib,"z",1,localTime);
        a = new File(code,"a",1,localTime);
        b = new File(code,"b",1,localTime);
        c = new File(code,"c",1,localTime);
        d = new File(home,"d",1,localTime);
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
        String expected[] = {"y","1","Apps"};
        String[] actual = FileToStringArray(y);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void verifyFileEqualityZ()
    {
        String expected[] = {"z", "1","lib"};
        String[] actual = FileToStringArray(z);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void verifyFileEqualityA()
    {
        String expected[] = {"a", "1", "code"};
        String[] actual = FileToStringArray(a);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void verifyFileEqualityB()
    {
        String expected[] = {"b", "1", "code"};
        String[] actual = FileToStringArray(b);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void verifyFileEqualityC()
    {
        String expected[] = {"c", "1", "code"};
        String[] actual = FileToStringArray(c);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void verifyFileEqualityD()
    {
        String expected[] = {"d", "1", "home"};
        String[] actual = FileToStringArray(d);
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
    public void FileTestD()
    {
        assertTrue(d.isFile());
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
    public void FileTestZ()
    {
        assertTrue(z.isFile());
    }
    @Test
    public void FileTesthome()
    {
        assertFalse(home.isFile());
    }
}