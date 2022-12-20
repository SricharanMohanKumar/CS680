package edu.umb.cs680.hw10.fs;

public class LoggedOut implements State
{
    private final SecurityContext ctx;

    public LoggedOut(SecurityContext ctx)
    {
        this.ctx = ctx;
    }
    public void login(Encrypted user,Encrypted pwd)
    {
        if ( authenticate.authorize(ctx,user,pwd) )
        {
            ctx.flag=0;
            ctx.changeState(new LoggedIn(ctx));
        }
        else
        {
            System.out.print("Invalid UserName or Password");
        }
    }
    public void logout()
    {

    }
}