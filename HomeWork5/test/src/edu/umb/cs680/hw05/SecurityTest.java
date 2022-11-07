package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SecurityTest {

    @Test
    public void LoggedOutState(){
        SecurityContext ctx = new SecurityContext(new User("james","boxerjames"));
        assertTrue(ctx.getState() instanceof LoggedOut);
    }

    @Test
    public void LoggedOutToLoggedIn(){
        SecurityContext ctx = new SecurityContext(new User("james","boxerjames"));
        ctx.login(new Encrypted(),new Encrypted());
        assertTrue(ctx.getState() instanceof LoggedIn);
    }

    @Test
    public void LoggedInStateAfterSomeTime(){
        SecurityContext ctx = new SecurityContext(new User("james","boxerjames"));
        ctx.login(new Encrypted(),new Encrypted());
        assertTrue(ctx.isActive());
    }

}