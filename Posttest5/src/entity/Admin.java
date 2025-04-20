package entity;

public class Admin {
    private String username;
    private String password;

    public Admin(){}
    public Admin(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username){
        this.username = username;
    }


}
