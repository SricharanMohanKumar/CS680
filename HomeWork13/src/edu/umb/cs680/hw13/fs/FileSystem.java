package edu.umb.cs680.hw13.fs;

import java.util.LinkedList;

public class FileSystem
{
    private LinkedList<Directory> RDir = new LinkedList<Directory>();
    private FileSystem()
    {

    }
    private static FileSystem FS = null;
    public static FileSystem getFileSystem()
    {
        if(FS == null)
        {
            FS = new FileSystem();
        }
        return FS;
    }
    public LinkedList<Directory> getRootDirs()
    {
        return RDir;
    }
    public void appendRootDir(Directory root)
    {
        this.RDir.add(root);
    }
}
