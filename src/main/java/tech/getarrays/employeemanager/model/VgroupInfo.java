package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vgroup_info")
public class VgroupInfo implements Serializable {

    @Id
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String lastname;
    private String patronymic;
    private String language;
    @Column(nullable = false, updatable = false)
    private String GroupInfoCode;

    public VgroupInfo() {}

    public VgroupInfo(String name, String lastname, String patronymic, String language, String GroupInfoCode) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.language = language;
        this.GroupInfoCode = GroupInfoCode;
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

    public void setName(String username) {
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGroupInfoCode() {
        return GroupInfoCode;
    }

    public void setGroupInfoCode(String groupInfoCode) {
        GroupInfoCode = groupInfoCode;
    }
}
