package psychology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_article")
public class Article {

    @Id
    private String picture = "";

    @Column
    private String articleLink = "";

    @Column
    private boolean valid = true;

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

    public boolean getValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public Article() {
    }

    public Article(String picture, String articleLink, boolean valid) {
        this.picture = picture;
        this.articleLink = articleLink;
        this.valid = valid;
    }
}
