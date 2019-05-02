package psychology.bl;

import psychology.entity.Topic;
import psychology.response.BasicResponse;
import psychology.response.TargetTopicVO;

public interface ForumService {
    /**
     * 论坛发表话题
     * @param userEmail
     * @param topic
     * @param detailedInfo
     * @param anonymity
     * @return
     */
    BasicResponse publishTopic(String userEmail, String topic, String detailedInfo, boolean anonymity);

    /**
     * 删除某一论坛话题
     * @param topicId
     * @return
     */
    BasicResponse deleteTopic(int topicId);

    /**
     * 回复论坛话题
     * @param topicId
     * @param content
     * @param userEmail
     * @param anonymity
     * @return
     */
    BasicResponse replyTopic(int topicId,String content,String userEmail,boolean anonymity);

    /**
     * 删除对某一论坛话题的回复
     * @param replyId
     * @return
     */
    BasicResponse deleteTopicReply(int replyId);

    /**
     * 查看所有的未被删除的论坛话题
     * @return
     */
    Topic[] getAllTopics();

    /**
     * 获取某一论坛话题的具体信息，显示所有未删除的回复
     * @param topicId
     * @return
     */
    TargetTopicVO getTargetTopic(int topicId);
}
