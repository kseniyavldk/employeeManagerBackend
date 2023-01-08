package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String lastname;
    private String patronymic;
    private Integer roleID;
    private Integer groupId;
    private Boolean isHeadman;
    @Column(nullable = false, updatable = false)
    private String userCode;

    public User() {}

    public User(String name, String lastname, String patronymic, Integer roleID, Integer groupId, Boolean isHeadman, String userCode) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.roleID = roleID;
        this.groupId = groupId;
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

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Boolean getIsHeadman() {
        return isHeadman;
    }

    public void setIsHeadman(Boolean isHeadman) {
        this.isHeadman = isHeadman;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", roleID='" + roleID + '\'' +
                ", isHeadman='" + isHeadman + '\'' +
                '}';
    }

    public String getFullName() {
        return name + lastname + patronymic;
    }
}
