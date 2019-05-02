package psychology.bl;

import psychology.entity.User;
import psychology.response.BasicResponse;

public interface AdminBasicFuncService {
    /**
     * 查看所有用户基本信息
     * @return
     */
    User[] getUserInfo();

    /**
     * 注销用户
     * @param userEmail
     * @return
     */
    BasicResponse cancelUser(String userEmail);
}
