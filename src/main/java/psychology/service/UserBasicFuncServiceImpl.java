package psychology.service;

import org.springframework.stereotype.Service;
import psychology.bl.UserBasicFuncService;
import psychology.response.UserInfoVO;

@Service
public class UserBasicFuncServiceImpl implements UserBasicFuncService {

    @Override
    public UserInfoVO getTargetUserInfo(String userEmail){
        //TODO

        return null;
    }
}
