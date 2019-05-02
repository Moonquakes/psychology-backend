package psychology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_message_reply")
public class MessageReply {

    @Id
    @Column
    private int replyId = 0;

    @Column
    private int messageId = 0;

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

    public boolean getValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public MessageReply() {
    }

    public MessageReply(int replyId, int messageId, String content, String userEmail, boolean anonymity) {
        this.replyId = replyId;
        this.messageId = messageId;
        this.content = content;
        this.userEmail = userEmail;
        this.anonymity = anonymity;
    }
}
