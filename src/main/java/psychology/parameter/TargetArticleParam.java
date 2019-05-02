package psychology.parameter;

public class TargetArticleParam {
    private String picture = "";
    private String articleLink = "";

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getArticleLink() {
        return articleLink;
    }

    public void setArticleLink(String articleLink) {
        this.articleLink = articleLink;
    }

    public TargetArticleParam() {
    }

    public TargetArticleParam(String picture, String articleLink) {
        this.picture = picture;
        this.articleLink = articleLink;
    }
}
