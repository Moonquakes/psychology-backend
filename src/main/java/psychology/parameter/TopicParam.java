package psychology.parameter;

public class TopicParam {
    private String userEmail = "";
    private String topic = "";
    private String detailedInfo = "";
    private boolean anonymity = false;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDetailedInfo() {
        return detailedInfo;
    }

    public void setDetailedInfo(String detailedInfo) {
        this.detailedInfo = detailedInfo;
    }

    public boolean getAnonymity() {
        return anonymity;
    }

    public void setAnonymity(boolean anonymity) {
        this.anonymity = anonymity;
    }

    public TopicParam() {
    }

    public TopicParam(String userEmail, String topic, String detailedInfo, boolean anonymity) {
        this.userEmail = userEmail;
        this.topic = topic;
        this.detailedInfo = detailedInfo;
        this.anonymity = anonymity;
    }
}
