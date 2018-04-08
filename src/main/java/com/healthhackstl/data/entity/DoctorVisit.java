package com.healthhackstl.data.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="DOCTOR_VISIT")
public class DoctorVisit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="VISIT_ID")
    private long id;

    @Column(name="DOCTOR_ID")
    private long doctorId;

    @Column(name="USER_ID")
    private long userId;

    @Column(name="VISIT_DATE")
    private Date date;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
