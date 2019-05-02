package psychology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import psychology.bl.AdminBasicFuncService;
import psychology.entity.User;
import psychology.parameter.UserEmailParam;
import psychology.response.BasicResponse;

@CrossOrigin
@RestController
@RequestMapping(value = "/admin")
public class AdminBasicFuncController {
    @Autowired
    private AdminBasicFuncService adminBasicFuncService;

    @GetMapping(value = "/getUserInfo")
    public User[] getUserInfo(){
        return adminBasicFuncService.getUserInfo();
    }

    @PostMapping(value = "/cancelUser")
    public BasicResponse cancelUser(@RequestBody UserEmailParam param){
        return adminBasicFuncService.cancelUser(param.getUserEmail());
    }
}
