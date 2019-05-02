package psychology.parameter;

public class TopicReplyParam {
    private int topicId = 0;
    private String content = "";
    private String userEmail = "";
    private boolean anonymity = false;

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
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

    public TopicReplyParam() {
    }

    public TopicReplyParam(int topicId, String content, String userEmail, boolean anonymity) {
        this.topicId = topicId;
        this.content = content;
        this.userEmail = userEmail;
        this.anonymity = anonymity;
    }
}
