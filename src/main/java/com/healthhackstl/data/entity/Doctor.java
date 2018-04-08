package com.healthhackstl.data.entity;

import javax.persistence.*;

@Entity
@Table(name="DOCTOR")
public class Doctor {

    @Id
    @Column(name="DOCTOR_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="VISIT_INFO")
    private String visitInfo;

    @Column(name="ADDRESS")
    private String Address;

    @Column(name="STATE")
    private String state;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getVisitInfo() {
        return visitInfo;
    }

    public void setVisitInfo(String visitInfo) {
        this.visitInfo = visitInfo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
