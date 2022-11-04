package edu.umb.cs680.hw03;
class Singleton
{
    private static Singleton singleton_instance = null;
    public String s;
    private Singleton()
    {
        s="this is singleton class";
    }
    public static Singleton getInstance()
    {
        if (singleton_instance == null)
        {
            singleton_instance = new Singleton();
        }
        return singleton_instance;
    }
    public static void main(String[] args)
    {
        Singleton.getInstance();
    }

}
