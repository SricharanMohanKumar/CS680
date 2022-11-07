package edu.umb.cs680.hw06;
public class SecurityContext
{
    public String username;
    public String password;
    public int flag=1;
    public static State state;
    public SecurityContext(User user)
    {
        changeState(new LoggedOut(this));
    }
    public State getState()
    {
        return state;
    }
    public State changeState(State NewState)
    {
        state = NewState;
        return state;
    }
    public void login(String username, String password)
    {
        state.login(username,password);
        flag = 0;
    }
    public void logout()
    {
        flag = 1;
        state.logout();
    }
    public boolean isActive()
    {
        if (flag==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}