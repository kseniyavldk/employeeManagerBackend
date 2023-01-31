package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vuser")
public class Vuser implements Serializable {
    @Id
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String lastname;
    private String patronymic;
    private String rolename;
    private String groupname;
    private Boolean isHeadman;
    @Column(nullable = false, updatable = false)
    private String userCode;

    public Vuser() {}

    public Vuser(Long id, String name, String lastname, String patronymic, String rolename, String groupname, Boolean isHeadman, String userCode) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.rolename = rolename;
        this.groupname = groupname;
        this.isHeadman = isHeadman;
        this.userCode = userCode;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public Boolean getHeadman() {
        return isHeadman;
    }

    public void setHeadman(Boolean headman) {
        isHeadman = headman;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}
