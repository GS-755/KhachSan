package com.sinhvien.khachsan.models;

import com.google.gson.annotations.SerializedName;
import java.sql.Date;

public class User {
    @SerializedName("cccd")
    private String cid;
    @SerializedName("hoLot")
    private String firstName;
    @SerializedName("ten")
    private String lastName;
    @SerializedName("ngaysinh")
    private Date dob;
    @SerializedName("gioitinh")
    private int gender;
    @SerializedName("diachi")
    private String address;

    public User() { }
    public User(String cid, String firstName, String lastName,
                Date dob, int gender, String address) {
        this.cid = cid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
    }

    public String getCid() { return this.cid; }
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public Date getDob() { return this.dob; }
    public int getGender() { return this.gender; }
    public String getAddress() { return this.address; }
    public void setCid(String cid) {
        this.cid = cid;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
