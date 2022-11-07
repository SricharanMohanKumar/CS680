package edu.umb.cs680.hw05;
import java.util.*;
public class SecurityContext
{
    public static String username;
    public static String password;
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
    public void login(Encrypted username, Encrypted password)
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

    public static void main(String[] args)
    {
        System.out.println("Enter User Name");
        username = String.valueOf(new Scanner(System.in));
        System.out.println("Enter the Password");
        password = String.valueOf(new Scanner(System.in));
        SecurityContext ctx = new SecurityContext(new User(username,password));
        ctx.login(new Encrypted(),new Encrypted());
        ctx.isActive();
    }
}