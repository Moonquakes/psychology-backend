package psychology.service;

import org.springframework.stereotype.Service;
import psychology.bl.AdminBasicFuncService;
import psychology.entity.User;
import psychology.response.BasicResponse;

@Service
public class AdminBasicFuncServiceImpl implements AdminBasicFuncService {

    @Override
    public User[] getUserInfo(){
        //TODO

        return null;
    }

    @Override
    public BasicResponse cancelUser(String userEmail){
        //TODO

        return null;
    }
}
