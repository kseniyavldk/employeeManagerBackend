package tech.getarrays.employeemanager.model;

import javax.persistence.*;

@Entity
public class GroupUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Integer group_Id;
    private Integer userId;
    @Column(nullable = false, updatable = false)
    private String groupUserCode;

    public GroupUser() {}

    public GroupUser(Integer group_Id, Integer userId, String groupUserCode) {

        this.group_Id = group_Id;
        this.userId = userId;
        this.groupUserCode = groupUserCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGroup_Id() {
        return group_Id;
    }

    public void setGroup_Id(Integer group_Id) {
        this.group_Id = group_Id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getGroupUserCode() {
        return groupUserCode;
    }

    public void setGroupUserCode(String groupUserCode) {
        this.groupUserCode = groupUserCode;
    }

    @Override
    public String toString() {
        return "Cabinet{" +
                "id=" + id +
                ", group_Id='" + group_Id + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
