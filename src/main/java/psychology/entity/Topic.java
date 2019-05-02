package psychology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_topic")
public class Topic {

    @Id
    @Column
    private int topicId = 0;

    @Column
    private String userEmail = "";

    @Column
    private String topic = "";

    @Column
    private String detailedInfo = "";

    /**
     * 是否匿名
     */
    @Column
    private boolean anonymity = false;

    /**
     * 记录是否被删除
     */
    @Column
    private boolean valid = true;

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
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

    public boolean getValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Topic() {
    }

    public Topic(int topicId,
                 String userEmail,
                 String topic,
                 String detailedInfo,
                 boolean anonymity,
                 boolean valid) {
        this.topicId = topicId;
        this.userEmail = userEmail;
        this.topic = topic;
        this.detailedInfo = detailedInfo;
        this.anonymity = anonymity;
        this.valid = valid;
    }
}
