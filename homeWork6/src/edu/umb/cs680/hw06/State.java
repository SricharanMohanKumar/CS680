package edu.umb.cs680.hw06;

public interface State {
    public void login(String user,String pwd);
    public void logout();
}