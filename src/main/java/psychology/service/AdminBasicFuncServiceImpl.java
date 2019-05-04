package psychology.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import psychology.bl.AdminBasicFuncService;
import psychology.dao.UserRepo;
import psychology.entity.User;
import psychology.response.BasicResponse;

import java.util.List;

@Service
public class AdminBasicFuncServiceImpl implements AdminBasicFuncService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User[] getUserInfo(){
        List<User> userList = userRepo.findAll();
        User[] users = new User[userList.size()];
        for(int i=0;i<userList.size();i++){
            users[i] = userList.get(i);
        }
        return users;
    }

    @Override
    public BasicResponse cancelUser(String userEmail){
        User user = null;
        if(userRepo.findById(userEmail).isPresent()){
            user = userRepo.findById(userEmail).get();
            userRepo.delete(user);
            return new BasicResponse(true,"");
        }else {
            return new BasicResponse(false,"该用户邮箱不存在！");
        }
    }
}
