package edu.umb.cs680.hw10.fs;
import edu.umb.cs680.hw10.fs.util.FileCrawlingVisitor;
import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw10.fs.util.*;
import java.time.LocalDateTime;
public class LoginTest
{

    @Test
    public void Loggedin()
    {
        LocalDateTime localTime = LocalDateTime.now();
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
        SecurityContext ctx1 = new SecurityContext(new User("james","boxerjames"));
        ctx1.login(new Encrypted(),new Encrypted());
        FileCrawlingVisitor visitor = new FileCrawlingVisitor();
        root.accept(visitor);
        visitor.getFiles();
    }

}

