package psychology.response;

public class TopicReplyVO {
    private int replyId = 0;
    private String content = "";
    private String username = "";
    private boolean anonymity = false;

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean getAnonymity() {
        return anonymity;
    }

    public void setAnonymity(boolean anonymity) {
        this.anonymity = anonymity;
    }

    public TopicReplyVO() {
    }

    public TopicReplyVO(int replyId, String content, String username, boolean anonymity) {
        this.replyId = replyId;
        this.content = content;
        this.username = username;
        this.anonymity = anonymity;
    }
}
