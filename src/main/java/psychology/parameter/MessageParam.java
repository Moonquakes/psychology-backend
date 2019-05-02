package psychology.parameter;

public class MessageParam {
    private String userEmail = "";
    private String content = "";
    private boolean anonymity = false;
    private boolean open = false;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean getAnonymity() {
        return anonymity;
    }

    public void setAnonymity(boolean anonymity) {
        this.anonymity = anonymity;
    }

    public boolean getOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public MessageParam() {
    }

    public MessageParam(String userEmail, String content, boolean anonymity, boolean open) {
        this.userEmail = userEmail;
        this.content = content;
        this.anonymity = anonymity;
        this.open = open;
    }
}
