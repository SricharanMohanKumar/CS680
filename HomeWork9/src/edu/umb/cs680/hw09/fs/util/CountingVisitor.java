package edu.umb.cs680.hw09.fs.util;
import edu.umb.cs680.hw09.fs.*;
import edu.umb.cs680.hw09.fs.FSVisitor;

public class CountingVisitor implements FSVisitor
{
    private int dirNum =0;
    private int fileNum = 0;
    private int linkNum = 0;
    public void visit(Link link)
    {
        linkNum = linkNum+1;
    }
    public void visit(Directory dir)
    {
        System.out.println(dirNum);
        dirNum++;
    }
    public void visit(File file)
    {
        fileNum = fileNum+1;
    }
    public int getDirNum()
    {
        return dirNum;
    }
    public int getLinkNum()
    {
        return linkNum;
    }
    public int getFileNum()
    {
        return fileNum;
    }
}
