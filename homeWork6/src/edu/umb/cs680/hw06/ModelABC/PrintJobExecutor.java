package edu.umb.cs680.hw06.ModelABC;
import edu.umb.cs680.hw06.SecurityContext;
public class PrintJobExecutor extends edu.umb.cs680.hw06.PrintingFramework.PrintJobExecutor
{
    protected void doAuthentication(String user,String password, SecurityContext ctx)
    {
        try
        {
            ctx.login(user, password);
        }
        catch (Exception ex)
        {
            System.out.println("exception"+ex);
        }
    }
    protected void doAccessControl()
    {

    }
    protected void doPrint(SecurityContext ctx)
    {
        if(ctx.isActive())
        {
            System.out.println("User is Logged in Printing data");
        }
        else
        {
            System.out.println("Login Failed");
        }
    }
    protected void doErrorHandling()
    {
        System.out.println("Handling Errors");
    }
}
