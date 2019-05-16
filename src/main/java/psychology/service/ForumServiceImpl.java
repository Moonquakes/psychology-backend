package psychology.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import psychology.bl.ForumService;
import psychology.dao.TopicReplyRepo;
import psychology.dao.TopicRepo;
import psychology.dao.UserRepo;
import psychology.entity.Topic;
import psychology.entity.TopicReply;
import psychology.response.BasicResponse;
import psychology.response.TargetTopicVO;
import psychology.response.TopicReplyVO;
import psychology.response.UserInfoVO;

import java.util.List;

@Service
public class ForumServiceImpl implements ForumService {

    @Autowired
    private TopicRepo topicRepo;
    private TopicReplyRepo topicReplyRepo;
    private UserRepo userRepo;

    @Override
    public BasicResponse publishTopic(String userEmail, String topic, String detailedInfo, boolean anonymity) {
        long topicID = topicRepo.count();
        Topic forum = new Topic((int) topicID, userEmail, topic, detailedInfo, anonymity, true);
        topicRepo.save(forum);
        //TODO
        return new BasicResponse(true, "");
    }

    @Override
    public BasicResponse deleteTopic(int topicId) {
        if (topicRepo.findById(topicId).isPresent()) {

            if (topicRepo.getOne(topicId).getValid()) {
                topicRepo.getOne(topicId).setValid(false);
                return new BasicResponse(true, "");
            } else {
                return new BasicResponse(false, "该论坛不存在！");
            }
        }
        //TODO
        else {
            return new BasicResponse(false, "该论坛不存在！");
        }
    }

    @Override
    public BasicResponse replyTopic(int topicId, String content, String userEmail, boolean anonymity) {
        if (topicRepo.findById(topicId).isPresent()) {
            if (topicRepo.getOne(topicId).getValid()) {
                long replyId = topicReplyRepo.count();
                TopicReply topicReply = new TopicReply(topicId, (int) replyId, content, userEmail, anonymity);
                topicReplyRepo.save(topicReply);
                return new BasicResponse(true, "");
            } else {
                return new BasicResponse(false, "该论坛不存在！");
            }
        }
        //TODO
        else {
            return new BasicResponse(false, "该论坛不存在！");
        }

    }

    @Override
    public BasicResponse deleteTopicReply(int replyId) {
        if (topicReplyRepo.findById(replyId).isPresent()) {
            if (topicReplyRepo.getOne(replyId).getValid()) {
                topicReplyRepo.getOne(replyId).setValid(false);
                return new BasicResponse(true, "");
            } else {
                return new BasicResponse(false, "该留言不存在");
            }
        } else {
            return new BasicResponse(false, "该留言不存在");
        }
        //TODO


    }

    @Override
    public Topic[] getAllTopics() {
        //TODO
        List<Topic> topicList = topicRepo.findAll();
        Topic[] topics = new Topic[topicList.size()];
        for (int i = 0; i < topicList.size(); i++) {
            topics[i] = topicList.get(i);
        }
        return topics;
    }

    @Override
    public TargetTopicVO getTargetTopic(int topicId) {
        //TODO
        if (topicRepo.findById(topicId).isPresent()) {
            if (topicRepo.getOne(topicId).getValid()) {
                //获取topic的所有信息
                String topic = topicRepo.getOne(topicId).getTopic();
                String detailedInfo = topicRepo.getOne(topicId).getDetailedInfo();
                boolean anonymity = topicRepo.getOne(topicId).getAnonymity();
                String userEmail = topicRepo.getOne(topicId).getUserEmail();
                String userName = userRepo.getOne(userEmail).getUsename();
                //获取有效的topicReply
                List<TopicReply> topicReplyList = topicReplyRepo.findAll();
                List<TopicReplyVO> topicReplyVOS = null;
                TopicReplyVO topicReplyVO=new TopicReplyVO();
                for (TopicReply topicReply : topicReplyList) {
                    if (topicReply.getValid()){
                        userName = userRepo.getOne(userEmail).getUsename();
                        topicReplyVO=new TopicReplyVO(topicReply.getReplyId(),topicReply.getContent(),userName,topicReply.getAnonymity());
                    }
                }
                //将List<TopicReplyVO>类型转化为TopicReplyVO类型
                TopicReplyVO[] topicReplyVOList=new TopicReplyVO[topicReplyVOS.size()];
                for(int i=0;i<=topicReplyVOList.length;i++){
                    topicReplyVOList[i]=topicReplyVOS.get(i);
                }
                TargetTopicVO targetTopicVO=new TargetTopicVO(topic,detailedInfo,anonymity,userName,topicReplyVOList);
                return targetTopicVO;
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }
    }
}
