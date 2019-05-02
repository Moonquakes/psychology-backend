package psychology.parameter;

public class UserEmailParam {
    private String userEmail = "";

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public UserEmailParam() {
    }

    public UserEmailParam(String userEmail) {
        this.userEmail = userEmail;
    }
}
