package psychology.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import psychology.bl.ArticleService;
import psychology.response.BasicResponse;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Override
    public BasicResponse uploadPhoto(String url, MultipartFile multipartFile){
        //TODO

        return null;
    }

    @Override
    public BasicResponse updateTargetArticle(String picture,String articleLink){
        //TODO

        return null;
    }

    @Override
    public BasicResponse cancelPicture(String picture){
        //TODO

        return null;
    }
}
