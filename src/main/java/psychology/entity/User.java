package psychology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User {

    @Id
    @Column
    private String userEmail = "";

    @Column
    private String usename = "";

    @Column
    private String password = "";


    public String getUsename() {
        return usename;
    }
}
