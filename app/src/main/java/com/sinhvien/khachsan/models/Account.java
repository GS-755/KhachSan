package com.sinhvien.khachsan.models;

import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

public class Account {
    @SerializedName("tendangnhap")
    private String userName;
    @SerializedName("matkhau")
    private String password;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;
    @SerializedName("mavaitro")
    private int roleId;
    @SerializedName("cccd")
    private String cid;
    @Nullable
    private User user;

    public Account() {
        this.user = new User();
    }
    public Account(String userName, String password,
                   String email, String phone, int roleId, String cid) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.roleId = roleId;
        this.cid = cid;
    }

    public String getUserName() { return this.userName; }
    public String getPassword() { return this.password; }
    public String getEmail() { return this.email; }
    public String getPhone() { return this.phone; }
    public int getRoleId() { return this.roleId; }
    public String getCid() { return this.cid; }
    @Nullable
    public User getUser() {
        return this.user;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
    public void setCid(String cid) {
        this.cid = cid;
    }
    public void setUser(@Nullable User user) {
        this.user = user;
    }
}
