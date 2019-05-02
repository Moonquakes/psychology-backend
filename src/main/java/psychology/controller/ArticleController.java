package psychology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import psychology.bl.ArticleService;
import psychology.parameter.PictureParam;
import psychology.parameter.TargetArticleParam;
import psychology.response.BasicResponse;

@CrossOrigin
@RestController
@RequestMapping(value = "/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @Value("${photoUrl}")
    private String url;

    @PostMapping(value = "/uploadPhoto")
    public BasicResponse uploadPhoto(MultipartHttpServletRequest multiRequest){
        return articleService.uploadPhoto(url,multiRequest.getFiles("file").get(0));
    }

    @PostMapping(value = "/updateTargetArticle")
    public BasicResponse updateTargetArticle(@RequestBody TargetArticleParam param){
        return articleService.updateTargetArticle(param.getPicture(),param.getArticleLink());
    }

    @PostMapping(value = "/cancelPicture")
    public BasicResponse cancelPicture(@RequestBody PictureParam param){
        return articleService.cancelPicture(param.getPicture());
    }
}
