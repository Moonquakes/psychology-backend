package psychology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import psychology.bl.LoginService;
import psychology.parameter.AdminParam;
import psychology.parameter.UserLoginParam;
import psychology.parameter.UserSignUpParam;
import psychology.response.BasicResponse;

@CrossOrigin
@RestController
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/adminLogin")
    public BasicResponse adminLogin(@RequestBody AdminParam param){
        return loginService.adminLogin(param.getUsername(),param.getPassword());
    }

    @PostMapping(value = "/userSignUp")
    public BasicResponse userSignUp(@RequestBody UserSignUpParam param){
        return loginService.userSignUp(param.getUserEmail(),param.getUsername(),param.getPassword());
    }

    @PostMapping(value = "/userLogin")
    public BasicResponse userLogin(@RequestBody UserLoginParam param){
        return loginService.userLogin(param.getUserEmail(),param.getPassword());
    }
}
