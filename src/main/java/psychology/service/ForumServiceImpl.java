package psychology.service;

import org.springframework.stereotype.Service;
import psychology.bl.ForumService;
import psychology.entity.Topic;
import psychology.response.BasicResponse;
import psychology.response.TargetTopicVO;

@Service
public class ForumServiceImpl implements ForumService {

    @Override
    public BasicResponse publishTopic(String userEmail, String topic, String detailedInfo, boolean anonymity){
        //TODO

        return null;
    }

    @Override
    public BasicResponse deleteTopic(int topicId){
        //TODO

        return null;
    }

    @Override
    public BasicResponse replyTopic(int topicId,String content,String userEmail,boolean anonymity){
        //TODO

        return null;
    }

    @Override
    public BasicResponse deleteTopicReply(int replyId){
        //TODO

        return null;
    }

    @Override
    public Topic[] getAllTopics(){
        //TODO

        return null;
    }

    @Override
    public TargetTopicVO getTargetTopic(int topicId){
        //TODO

        return null;
    }
}
