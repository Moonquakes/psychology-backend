package psychology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_topic_reply")
public class TopicReply {

    @Id
    @Column
    private int replyId = 0;

    @Column
    private int topicId = 0;

    @Column
    private String content = "";

    @Column
    private String userEmail = "";

    @Column
    private boolean anonymity = false;

    @Column
    private boolean valid = true;

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

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

    public boolean getValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public TopicReply() {
    }

    public TopicReply(int replyId, int topicId, String content, String userEmail, boolean anonymity) {
        this.replyId = replyId;
        this.topicId = topicId;
        this.content = content;
        this.userEmail = userEmail;
        this.anonymity = anonymity;
    }
}
