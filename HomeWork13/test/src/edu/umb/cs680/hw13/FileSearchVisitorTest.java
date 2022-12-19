package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import edu.umb.cs680.hw13.fs.*;

import edu.umb.cs680.hw13.fs.util.CountingVisitor;

import edu.umb.cs680.hw13.fs.util.FileSearchVisitor;
import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw13.fs.*;

import java.time.LocalDateTime;

class FileSearchVisitorTest
{
    static LocalDateTime localTime = LocalDateTime.now();
    Directory root = new Directory(null,"root",0, localTime);
    Directory Apps = new Directory(root,"Apps",0, localTime);
    Directory bin = new Directory(root,"bin",0, localTime);
    Directory home = new Directory(root,"home",0, localTime);
    Directory pictures = new Directory(home,"pictures",0, localTime);
    File x = new File(Apps,"x",1,localTime);
    File y = new File(bin,"y",1,localTime);
    File a = new File(pictures,"a",1,localTime);
    File b = new File(pictures,"b",1,localTime);
    File c = new File(home,"c",1,localTime);
    Link d = new Link(root,"d",2,localTime,pictures);
    Link e = new Link(root,"e",2,localTime,x);
    @Test
    public void GetFile()
    {
        FileSearchVisitor visitor = new FileSearchVisitor("y");
        y.accept(visitor);
        System.out.println(visitor.getFoundFiles().size());
        assertEquals(visitor.getFoundFiles().size(),1);
    }
}

