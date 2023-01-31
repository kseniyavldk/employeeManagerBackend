package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class GroupInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Integer userId;
    private Integer languageId;
    @Column(nullable = false, updatable = false)
    private String GroupInfoCode;

    public GroupInfo() {}

    public GroupInfo(Integer userId, Integer languageId, String GroupInfoCode) {
        this.userId = userId;
        this.languageId = languageId;
        this.GroupInfoCode = GroupInfoCode;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getGroupInfoCode() {
        return GroupInfoCode;
    }

    public void setGroupInfoCode(String GroupInfoCode) { this.GroupInfoCode = GroupInfoCode; }

    @Override
    public String toString() {
        return "GroupInfo{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", languageId='" + languageId + '\'' +
                '}';
    }
}
