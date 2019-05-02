package psychology.parameter;

public class MessageReplyParam {
    private int messageId = 0;
    private String content = "";
    private String userEmail = "";
    private boolean anonymity = false;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public boolean getAnonymity() {
        return anonymity;
    }

    public void setAnonymity(boolean anonymity) {
        this.anonymity = anonymity;
    }

    public MessageReplyParam() {
    }

    public MessageReplyParam(int messageId, String content, String userEmail, boolean anonymity) {
        this.messageId = messageId;
        this.content = content;
        this.userEmail = userEmail;
        this.anonymity = anonymity;
    }
}
