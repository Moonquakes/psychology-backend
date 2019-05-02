package psychology.bl;

import psychology.response.UserInfoVO;

public interface UserBasicFuncService {
    /**
     * 用户查看个人信息
     * @param userEmail
     * @return
     */
    UserInfoVO getTargetUserInfo(String userEmail);
}
