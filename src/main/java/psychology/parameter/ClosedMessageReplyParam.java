package psychology.parameter;

public class ClosedMessageReplyParam {
    private int messageId = 0;
    private String content = "";

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

    public ClosedMessageReplyParam() {
    }

    public ClosedMessageReplyParam(int messageId, String content) {
        this.messageId = messageId;
        this.content = content;
    }
}
