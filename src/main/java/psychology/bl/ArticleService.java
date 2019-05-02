package psychology.bl;

import org.springframework.web.multipart.MultipartFile;
import psychology.response.BasicResponse;

public interface ArticleService {
    /**
     * 上传图片，返回图片的地址
     * @param url
     * @param multipartFile
     * @return
     */
    BasicResponse uploadPhoto(String url, MultipartFile multipartFile);

    /**
     * 更新图片对应公众号文章
     * @param picture
     * @param articleLink
     * @return
     */
    BasicResponse updateTargetArticle(String picture,String articleLink);

    /**
     * 设置图片状态为不可见
     * @param picture
     * @return
     */
    BasicResponse cancelPicture(String picture);
}
