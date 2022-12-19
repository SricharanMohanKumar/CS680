package edu.umb.cs680.hw07;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.util.Optional;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
class DirectoryTest
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
    
    
    private String[] dirToStringArray(Directory d)
    {
        Optional<Directory> optionalDirectory = Optional.ofNullable(d.getParent());
        String[] dirInfo = {d.getName(), Integer.toString(d.getSize()),optionalDirectory.isPresent()?d.getParent().getName():null};
        return dirInfo;
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
    public void verifyDirectoryEqualityRoot()
    {
        String expected[] = {"root", "0",null};
        String[] actual = dirToStringArray(root);
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
    public void verifyDirectoryEqualityCode()
    {
        String expected[] = {"code", "0", "home"};
        String[] actual = dirToStringArray(code);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void verifyDirectoryEqualitylib()
    {
        String expected[] = {"lib", "0", "root"};
        String[] actual = dirToStringArray(lib);
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
    public void DirectoryTestcode()
    {
        assertTrue(code.isDirectory());
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
        assertEquals(3,root.countChildren());
    }
    @Test
    public void subFilescountcode()
    {
        assertEquals(3,code.countChildren());
    }
    @Test
    public void subFilescountApps()
    {
        assertEquals(2,Apps.countChildren());
    }
    @Test
    public void subFilescounthome()
    {
        assertEquals(2,home.countChildren());
    }
    @Test
    public void subFilescountlib()
    {
        assertEquals(1,lib.countChildren());
    }
}