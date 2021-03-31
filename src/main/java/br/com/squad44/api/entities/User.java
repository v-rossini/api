package br.com.squad44.api.entities;

import javax.persistence.Entity;

@Entity
public class User {
    
    private Long parentId;
    private Long DonatorId;
    private String passoword;

    public User() {

    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setDonatorId(Long donatorId) {
        DonatorId = donatorId;
    }

    public Long getDonatorId() {
        return DonatorId;
    }

    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }

    public String getPassoword() {
        return passoword;
    }
    
}
