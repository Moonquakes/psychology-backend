package psychology.bl;

import psychology.response.BasicResponse;
import psychology.response.MessageVO;

public interface TreeHoleService {
    /**
     * 树洞发表留言
     * @param userEmail
     * @param content
     * @param anonymity
     * @param open
     * @return
     */
    BasicResponse leaveMessage(String userEmail,String content,boolean anonymity,boolean open);

    /**
     * 删除某一树洞留言
     * @param messageId
     * @return
     */
    BasicResponse deleteMessage(int messageId);

    /**
     * 回复树洞留言
     * @param messageId
     * @param content
     * @param userEmail
     * @param anonymity
     * @return
     */
    BasicResponse replyMessage(int messageId,String content,String userEmail,boolean anonymity);

    /**
     * 删除对某一树洞留言的回复
     * @param replyId
     * @return
     */
    BasicResponse deleteMessageReply(int replyId);

    /**
     * 查看所有公开的未被删除的树洞留言
     * @return
     */
    MessageVO[] getAllMessage();

    /**
     * 查看所有不公开的树洞留言
     * @return
     */
    MessageVO[] getAllClosedMessage();

    /**
     *
     回复非开放的树洞留言
     * @param messageId
     * @param content
     * @return
     */
    BasicResponse replyClosedMessage(int messageId, String content);
}
