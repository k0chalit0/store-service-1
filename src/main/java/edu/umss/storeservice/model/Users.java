package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.UsersDto;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Users extends ModelBase<UsersDto>{
    private String accountUser;
    private byte[] passwordUser;
    private byte[] rePasswordUser;
    private String securityQuest1;
    private String securityQuest2;
    private Boolean isDeleted;

    @Basic
    @Column(name = "Account_user")
    public String getAccountUser() {
        return accountUser;
    }

    public void setAccountUser(String accountUser) {
        this.accountUser = accountUser;
    }

    @Basic
    @Column(name = "Password_User")
    public byte[] getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(byte[] passwordUser) {
        this.passwordUser = passwordUser;
    }

    @Basic
    @Column(name = "RePassword_User")
    public byte[] getRePasswordUser() {
        return rePasswordUser;
    }

    public void setRePasswordUser(byte[] rePasswordUser) {
        this.rePasswordUser = rePasswordUser;
    }

    @Basic
    @Column(name = "Security_Quest1")
    public String getSecurityQuest1() {
        return securityQuest1;
    }

    public void setSecurityQuest1(String securityQuest1) {
        this.securityQuest1 = securityQuest1;
    }

    @Basic
    @Column(name = "Security_Quest2")
    public String getSecurityQuest2() {
        return securityQuest2;
    }

    public void setSecurityQuest2(String securityQuest2) {
        this.securityQuest2 = securityQuest2;
    }

    @Basic
    @Column(name = "Is_Deleted")
    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

}
