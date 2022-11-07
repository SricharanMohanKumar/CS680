package edu.umb.cs680.hw06;

public class LoggedIn implements State{

	    private final SecurityContext ctx;
	    public LoggedIn(SecurityContext ctx)
	    {
	        this.ctx=ctx;
	    }
	    public void logout()
	    {
	        ctx.changeState(new LoggedOut(ctx));
	    }
	    public void login (String user,String password)
	    {
	        if(!ctx.isActive())
	        {
	            ctx.changeState(new LoggedOut(ctx));
	            ctx.login(user,password);
	        }
	    }
	
}
