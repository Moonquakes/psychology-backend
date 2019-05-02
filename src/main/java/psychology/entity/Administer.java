package psychology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_admin")
public class Administer {

    @Id
    @Column
    private String username ="";

    @Column
    private String password="";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Administer() {
    }

    public Administer(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
