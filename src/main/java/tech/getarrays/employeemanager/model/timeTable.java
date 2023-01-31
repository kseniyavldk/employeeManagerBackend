package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Table(name = "time_table")
public class timeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Integer groupId;
    private Integer cabinetId;
    private Date data;

    @Column(nullable = false, updatable = false)
    private String timeTableCode;

    public timeTable() {}

    public timeTable(Long id, Integer groupId, Integer cabinetId, Date data, String timeTableCode) {
        this.id = id;
        this.groupId = groupId;
        this.cabinetId = cabinetId;
        this.data = data;
        this.timeTableCode = timeTableCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getCabinetId() {
        return cabinetId;
    }

    public void setCabinetId(Integer cabinetId) {
        this.cabinetId = cabinetId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTimeTableCode() {
        return timeTableCode;
    }

    public void setTimeTableCode(String timeTableCode) {
        this.timeTableCode = timeTableCode;
    }

    @Override
    public String toString() {
        return "Cabinet{" +
                "id=" + id +
                ", groupId='" + groupId + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
