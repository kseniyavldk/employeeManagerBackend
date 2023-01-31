package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Cabinet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Integer number;
    @Column(nullable = false, updatable = false)
    private String cabinetCode;

    public Cabinet() {}

    public Cabinet(Integer number, String cabinetCode) {
        this.number = number;
        this.cabinetCode = cabinetCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCabinetCode() {
        return cabinetCode;
    }

    public void setCabinetCode(String cabinetCode) {
        this.cabinetCode = cabinetCode;
    }

    @Override
    public String toString() {
        return "Cabinet{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}

