package psychology.bl;

import psychology.response.BasicResponse;

public interface LoginService {
    /**
     * 管理员登陆
     * @param username
     * @param password
     * @return
     */
    BasicResponse adminLogin(String username, String password);

    /**
     * 用户注册
     * @param userEmail
     * @param username
     * @param password
     * @return
     */
    BasicResponse userSignUp(String userEmail, String username, String password);

    /**
     * 用户登录
     * @param userEmail
     * @param password
     * @return
     */
    BasicResponse userLogin(String userEmail, String password);
}
