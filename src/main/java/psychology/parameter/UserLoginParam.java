package psychology.parameter;

public class UserLoginParam {
    private String userEmail = "";
    private String password = "";

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserLoginParam() {
    }

    public UserLoginParam(String userEmail, String password) {
        this.userEmail = userEmail;
        this.password = password;
    }
}
