package com.example.jjis;

public class Credentials {
    String password;
    int login_no;

    public Credentials() {
    }

    public Credentials(String password, int login_no) {
        this.password = password;
        this.login_no = login_no;
    }

    public int getLogin_no() {
        return login_no;
    }

    public void setLogin_no(int login_no) {
        this.login_no = login_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
