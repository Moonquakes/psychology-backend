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

    @GetMapping(value = "/getTargetUserInfo")
    public UserInfoVO getTargetUserInfo(@RequestParam(value="userEmail") String userEmail){
        return userBasicFuncService.getTargetUserInfo(userEmail);
    }
}
