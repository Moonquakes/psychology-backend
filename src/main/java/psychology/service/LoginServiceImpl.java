package psychology.service;

import org.springframework.stereotype.Service;
import psychology.bl.LoginService;
import psychology.response.BasicResponse;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public BasicResponse adminLogin(String username, String password){
        //TODO

        return null;
    }

    @Override
    public BasicResponse userSignUp(String userEmail, String username, String password){
        //TODO

        return null;
    }

    @Override
    public BasicResponse userLogin(String userEmail, String password){
        //TODO

        return null;
    }
}
