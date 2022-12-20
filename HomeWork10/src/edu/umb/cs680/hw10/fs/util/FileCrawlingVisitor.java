package edu.umb.cs680.hw10.fs.util;
import edu.umb.cs680.hw10.fs.*;
import edu.umb.cs680.hw10.fs.FSVisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class FileCrawlingVisitor implements FSVisitor
{
    private LinkedList<File> files = new LinkedList<File>();
    public void visit(Link link)
    {
        return;
    }
    public void visit(Directory dir)
    {
        return;
    }
    public void visit(File file)
    {
        files.add(file);
    }
    public LinkedList<File> getFiles()
    {
        return files;
    }
}
