package psychology.service;

import org.springframework.stereotype.Service;
import psychology.bl.TreeHoleService;
import psychology.response.BasicResponse;
import psychology.response.MessageVO;

@Service
public class TreeHoleServiceImpl implements TreeHoleService {

    @Override
    public BasicResponse leaveMessage(String userEmail, String content, boolean anonymity, boolean open){
        //TODO

        return null;
    }

    @Override
    public BasicResponse deleteMessage(int messageId){
        //TODO

        return null;
    }

    @Override
    public BasicResponse replyMessage(int messageId,String content,String userEmail,boolean anonymity){
        //TODO

        return null;
    }

    @Override
    public BasicResponse deleteMessageReply(int replyId){
        //TODO

        return null;
    }

    @Override
    public MessageVO[] getAllMessage(){
        //TODO

        return null;
    }

    @Override
    public MessageVO[] getAllClosedMessage(){
        //TODO

        return null;
    }

    @Override
    public BasicResponse replyClosedMessage(int messageId, String content){
        //TODO

        return null;
    }
}
