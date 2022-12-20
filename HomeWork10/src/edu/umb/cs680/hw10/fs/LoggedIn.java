package edu.umb.cs680.hw10.fs;
public class LoggedIn implements State
{
    private final SecurityContext ctx;
    public LoggedIn(SecurityContext ctx)
    {
        this.ctx=ctx;
    }
    public void logout()
    {
        ctx.changeState(new LoggedOut(ctx));
    }
    public void login (Encrypted user,Encrypted password)
    {
        if(!ctx.isActive())
        {
            ctx.changeState(new LoggedOut(ctx));
            ctx.login(user,password);
        }
    }
}