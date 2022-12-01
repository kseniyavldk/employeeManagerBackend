package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class timeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Integer groupId;
    private Date data;

    @Column(nullable = false, updatable = false)
    private String timeTableCode;

    public timeTable() {}

    public timeTable(Integer groupId, Date data, String timeTableCode) {
        this.groupId = groupId;
        this.data = data;
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
