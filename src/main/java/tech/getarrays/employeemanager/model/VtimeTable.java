package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "vtime_table")
public class VtimeTable {
    @Id
    @Column(nullable = false, updatable = false)
    private Long id;
    private Date data;
    private String groupname;
    private Integer cabinet;
    private String fullname;

    @Column(nullable = false, updatable = false)
    private String timeTableCode;

    public VtimeTable() {
    }

    public VtimeTable(Long id, Date data, String groupname, Integer cabinet, String fullname, String timeTableCode) {
        this.id = id;
        this.data = data;
        this.groupname = groupname;
        this.cabinet = cabinet;
        this.fullname = fullname;
        this.timeTableCode = timeTableCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public Integer getCabinet() {
        return cabinet;
    }

    public void setCabinet(Integer cabinet) {
        this.cabinet = cabinet;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getTimeTableCode() {
        return timeTableCode;
    }

    public void setTimeTableCode(String timeTableCode) {
        this.timeTableCode = timeTableCode;
    }
}