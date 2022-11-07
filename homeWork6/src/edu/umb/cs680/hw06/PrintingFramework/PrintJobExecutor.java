package edu.umb.cs680.hw06.PrintingFramework;
import edu.umb.cs680.hw06.SecurityContext;
import edu.umb.cs680.hw06.User;

import java.util.Scanner;

public abstract class PrintJobExecutor
{
    public static String username;
    public static String password;

    public static PrintJobExecutor execute(PrintJobExecutor Job, String user, String password, SecurityContext ctx)
    {
        try
        {
            Job.doAuthentication(user,password,ctx);
            Job.doAccessControl();
            Job.doPrint(ctx);
            Job.doErrorHandling();
        }
        catch(Exception ex)
        {
            System.out.print("exception occurred" + ex);
        }

        return null;
    }
    protected abstract void doAuthentication(String user, String password, SecurityContext ctx);
    protected abstract void doAccessControl();
    protected abstract void doPrint(SecurityContext ctx);
    protected abstract void doErrorHandling();
    public static void main(String[] args)
    {
        System.out.println("Enter User Name");
        username = String.valueOf(new Scanner(System.in));
        System.out.println("Enter the Password");
        password = String.valueOf(new Scanner(System.in));
        SecurityContext ctx = new SecurityContext(new User(username,password));
        PrintJobExecutor object = new edu.umb.cs680.hw06.ModelABC.PrintJobExecutor();
        PrintJobExecutor ex = execute(object,"user","password",ctx);
        System.out.println(ex);
    }
}