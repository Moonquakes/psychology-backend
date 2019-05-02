package psychology.response;

public class MessageVO {
    private int messageId = 0;
    private String content = "";
    private boolean anonymity = false;
    private String username = "";
    private MessageReplyVO[] messageReply = new MessageReplyVO[0];

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

    public MessageReplyVO[] getMessageReply() {
        return messageReply;
    }

    public void setMessageReply(MessageReplyVO[] messageReply) {
        this.messageReply = messageReply;
    }

    public MessageVO() {
    }

    public MessageVO(int messageId,
                     String content,
                     boolean anonymity,
                     String username,
                     MessageReplyVO[] messageReply) {
        this.messageId = messageId;
        this.content = content;
        this.anonymity = anonymity;
        this.username = username;
        this.messageReply = messageReply;
    }
}
