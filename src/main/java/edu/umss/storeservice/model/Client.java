package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ClientDto;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client extends ModelBase<ClientDto>{
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String cardNumber;
    private String cardPin;
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
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "Card_Number")
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Basic
    @Column(name = "Card_PIN")
    public String getCardPin() {
        return cardPin;
    }

    public void setCardPin(String cardPin) {
        this.cardPin = cardPin;
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
