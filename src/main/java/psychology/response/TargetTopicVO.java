package psychology.response;

public class TargetTopicVO {
    private String topic = "";
    private String detailedInfo = "";
    private boolean anonymity = false;
    private String username = "";
    private TopicReplyVO[] topicReply = new TopicReplyVO[0];

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public TopicReplyVO[] getTopicReply() {
        return topicReply;
    }

    public void setTopicReply(TopicReplyVO[] topicReply) {
        this.topicReply = topicReply;
    }

    public TargetTopicVO() {
    }

    public TargetTopicVO(String topic,
                         String detailedInfo,
                         boolean anonymity,
                         String username,
                         TopicReplyVO[] topicReply) {
        this.topic = topic;
        this.detailedInfo = detailedInfo;
        this.anonymity = anonymity;
        this.username = username;
        this.topicReply = topicReply;
    }
}
