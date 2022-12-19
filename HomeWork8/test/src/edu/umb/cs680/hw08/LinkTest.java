package edu.umb.cs680.hw08;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
class LinkTest
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
    private String[] LinkToStringArray(Link l)
    {
        String link[] = {l.getName(), Integer.toString(l.getSize()),l.getParent().getName()};
        return link;
    }
    @Test
    public void verifyListD()
    {
        String expected[] = {"d", "2", "root"};
        String[] actual = LinkToStringArray(d);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void verifyListE()
    {
        String expected[] = {"e", "2", "root"};
        String[] actual = LinkToStringArray(e);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void verifyLinkEqualityE() {
        File expected = x;
        FSElement actual = e.getTarget();
        assertSame(expected, actual);
    }
    @Test
    public void verifyLinkEqualityD() {
        Directory expected = pictures;
        FSElement actual = d.getTarget();
        assertSame(expected, actual);
    }

}
