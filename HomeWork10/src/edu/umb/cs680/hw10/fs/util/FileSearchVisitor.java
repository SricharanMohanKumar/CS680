package edu.umb.cs680.hw10.fs.util;

import edu.umb.cs680.hw10.fs.Directory;
import edu.umb.cs680.hw10.fs.FSVisitor;
import edu.umb.cs680.hw10.fs.File;
import edu.umb.cs680.hw10.fs.Link;
import edu.umb.cs680.hw10.fs.util.FileSearchVisitor;

import java.util.LinkedList;

public class FileSearchVisitor implements FSVisitor
{
    public String fileName ;
    public FileSearchVisitor(String fileName)
    {
        this.fileName=fileName;
    }
    public LinkedList<File> foundFiles = new LinkedList<File>();
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
        if(file.getName().equals(fileName))
        {
            foundFiles.add(file);
        }
    }
    public LinkedList<File> getFoundFiles()
    {
        return foundFiles;
    }
}
