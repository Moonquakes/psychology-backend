package psychology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_message")
public class Message {

    @Id
    @Column
    private int messageId = 0;

    @Column
    private String userEmail = "";

    @Column
    private String content = "";

    /**
     * 是否匿名
     */
    @Column
    private boolean anonymity = false;

    /**
     * 是否开放
     */
    @Column
    private boolean open = false;

    /**
     * 记录是否被删除
     */
    @Column
    private boolean valid = true;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

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

    public boolean getValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public Message() {
    }

    public Message(int messageId,
                   String userEmail,
                   String content,
                   boolean anonymity,
                   boolean open) {
        this.messageId = messageId;
        this.userEmail = userEmail;
        this.content = content;
        this.anonymity = anonymity;
        this.open = open;
    }
}
