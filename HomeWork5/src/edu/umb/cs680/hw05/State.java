package edu.umb.cs680.hw05;

public interface State {
    public void login(Encrypted user,Encrypted pwd);
    public void logout();
}
