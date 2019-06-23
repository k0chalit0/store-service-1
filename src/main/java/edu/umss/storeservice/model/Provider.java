package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ProviderDto;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Provider extends ModelBase<ProviderDto>{
    private String firstName;
    private String lastName;
    private String corporateName;
    private Integer nitProvee;
    private Integer ciProvee;
    private Timestamp birthDate;
    private Boolean isDeleted;

    @Basic
    @Column(name = "First_Name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "Last_Name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "Corporate_Name")
    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    @Basic
    @Column(name = "Nit_provee")
    public Integer getNitProvee() {
        return nitProvee;
    }

    public void setNitProvee(Integer nitProvee) {
        this.nitProvee = nitProvee;
    }

    @Basic
    @Column(name = "Ci_provee")
    public Integer getCiProvee() {
        return ciProvee;
    }

    public void setCiProvee(Integer ciProvee) {
        this.ciProvee = ciProvee;
    }

    @Basic
    @Column(name = "Birth_date")
    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "Is_Deleted")
    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @ManyToOne
    private Users users;
}
