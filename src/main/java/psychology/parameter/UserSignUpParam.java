package psychology.parameter;

public class UserSignUpParam {
    private String userEmail = "";
    private String username = "";
    private String password = "";

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserSignUpParam() {
    }

    public UserSignUpParam(String userEmail, String username, String password) {
        this.userEmail = userEmail;
        this.username = username;
        this.password = password;
    }
}
