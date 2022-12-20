package edu.umb.cs680.hw10.fs;
import edu.umb.cs680.hw10.fs.Directory;
import edu.umb.cs680.hw10.fs.FSElement;
import java.time.LocalDateTime;

public class File extends FSElement
{
    public File(Directory parent, String name, int size, LocalDateTime creationTime)
    {
        super(parent,name,size,creationTime);
    }
    public boolean isDirectory()
    {
        return false;
    }
    public boolean isFile()
    {
        return true;
    }
    public boolean isLink()
    {
        return false;
    }
    public void accept(FSVisitor v)
    {
        v.visit(this);
    }
    public void accept(FSVisitor v, SecurityContext ctx)
    {
        if(ctx.isActive())
        {
            v.visit(this);
        }
        else
        {
            System.out.println("Login");
            ctx.login(new Encrypted(),new Encrypted());
        }
    }
}
