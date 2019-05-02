package psychology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import psychology.bl.TreeHoleService;
import psychology.entity.MessageReply;
import psychology.parameter.*;
import psychology.response.BasicResponse;
import psychology.response.MessageVO;

@CrossOrigin
@RestController
@RequestMapping(value = "/treeHole")
public class TreeHoleController {
    @Autowired
    private TreeHoleService treeHoleService;

    @PostMapping(value = "/leaveMessage")
    public BasicResponse leaveMessage(@RequestBody MessageParam param){
        return treeHoleService.leaveMessage(param.getUserEmail(),
                param.getContent(),
                param.getAnonymity(),
                param.getOpen());
    }

    @PostMapping(value = "/deleteMessage")
    public BasicResponse deleteMessage(@RequestBody MessageIdParam param){
        return treeHoleService.deleteMessage(param.getMessageId());
    }

    @PostMapping(value = "/replyMessage")
    public BasicResponse replyMessage(@RequestBody MessageReplyParam param){
        return treeHoleService.replyMessage(param.getMessageId(),
                param.getContent(),
                param.getUserEmail(),
                param.getAnonymity());
    }

    @PostMapping(value = "/deleteMessageReply")
    public BasicResponse deleteMessageReply(@RequestBody ReplyIdParam param){
        return treeHoleService.deleteMessageReply(param.getReplyId());
    }

    @GetMapping(value = "/getAllMessage")
    public MessageVO[] getAllMessage(){
        return treeHoleService.getAllMessage();
    }

    @GetMapping(value = "/getAllClosedMessage")
    public MessageVO[] getAllClosedMessage(){
        return treeHoleService.getAllClosedMessage();
    }

    @PostMapping(value = "/replyClosedMessage")
    public BasicResponse replyClosedMessage(@RequestBody ClosedMessageReplyParam param){
        return treeHoleService.replyClosedMessage(param.getMessageId(),param.getContent());
    }
}
