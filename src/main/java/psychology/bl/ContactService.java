package psychology.bl;

import psychology.entity.Contact;
import psychology.response.BasicResponse;

public interface ContactService {
    /**
     * 查看相关人士联系方式
     * @return
     */
    Contact[] getContact();

    /**
     * 添加相关人士联系方式
     * @param name
     * @param email
     * @param mobileNum
     * @return
     */
    BasicResponse addContact(String name,String email,String mobileNum);

    /**
     * 删除某一相关人士联系方式
     * @param name
     * @return
     */
    BasicResponse deleteContact(String name);

}
