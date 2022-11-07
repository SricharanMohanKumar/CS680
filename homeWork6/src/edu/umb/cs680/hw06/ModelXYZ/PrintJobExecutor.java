package edu.umb.cs680.hw06.ModelXYZ;
import edu.umb.cs680.hw06.SecurityContext;
public class PrintJobExecutor extends edu.umb.cs680.hw06.PrintingFramework.PrintJobExecutor
{
    protected void doAuthentication(String user, String password, SecurityContext ctx)
    {

    }
    protected void doAccessControl()
    {

    }
    protected void doPrint(SecurityContext ctx)
    {
        System.out.println("xyz Printing Data");
    }
    protected void doErrorHandling()
    {
        System.out.println("xyz Handling Error");
    }
}