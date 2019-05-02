package psychology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import psychology.bl.ForumService;
import psychology.entity.Topic;
import psychology.parameter.ReplyIdParam;
import psychology.parameter.TopicIdParam;
import psychology.parameter.TopicParam;
import psychology.parameter.TopicReplyParam;
import psychology.response.BasicResponse;
import psychology.response.TargetTopicVO;

@CrossOrigin
@RestController
@RequestMapping(value = "/forum")
public class ForumController {
    @Autowired
    private ForumService forumService;

    @PostMapping(value = "/publishTopic")
    public BasicResponse publishTopic(@RequestBody TopicParam param){
        return forumService.publishTopic(param.getUserEmail(),
                param.getTopic(),
                param.getDetailedInfo(),
                param.getAnonymity());
    }

    @PostMapping(value = "/deleteTopic")
    public BasicResponse deleteTopic(@RequestBody TopicIdParam param){
        return forumService.deleteTopic(param.getTopicId());
    }

    @PostMapping(value = "/replyTopic")
    public BasicResponse replyTopic(@RequestBody TopicReplyParam param){
        return forumService.replyTopic(param.getTopicId(),
                param.getContent(),
                param.getUserEmail(),
                param.getAnonymity());
    }

    @PostMapping(value = "/deleteTopicReply")
    public BasicResponse deleteTopicReply(@RequestBody ReplyIdParam param){
        return forumService.deleteTopicReply(param.getReplyId());
    }

    @GetMapping(value = "/getAllTopics")
    public Topic[] getAllTopics(){
        return forumService.getAllTopics();
    }

    @GetMapping(value = "/getTargetTopic")
    public TargetTopicVO getTargetTopic(@RequestBody TopicIdParam param){
        return forumService.getTargetTopic(param.getTopicId());
    }
}
