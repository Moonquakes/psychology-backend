package psychology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import psychology.bl.UserBasicFuncService;
import psychology.parameter.UserEmailParam;
import psychology.response.UserInfoVO;

@CrossOrigin
@RestController
@RequestMapping(value = "/user")
public class UserBasicFuncController {
    @Autowired
    private UserBasicFuncService userBasicFuncService;

    @PostMapping(value = "/getTargetUserInfo")
    public UserInfoVO getTargetUserInfo(@RequestBody UserEmailParam param){
        return userBasicFuncService.getTargetUserInfo(param.getUserEmail());
    }
}
