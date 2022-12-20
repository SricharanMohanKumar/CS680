package edu.umb.cs680.hw10.fs;

public interface State {
    public void login(Encrypted user,Encrypted pwd);
    public void logout();
}
