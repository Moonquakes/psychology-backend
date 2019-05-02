package psychology.parameter;

public class MessageIdParam {
    private int messageId = 0;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public MessageIdParam() {
    }

    public MessageIdParam(int messageId) {
        this.messageId = messageId;
    }
}
