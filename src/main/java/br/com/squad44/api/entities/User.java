package br.com.squad44.api.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Table(name = "tb_user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        this.passoword = new BCryptPasswordEncoder().encode(passoword);
    }

    public String getPassoword() {
        return passoword;
    }

}
