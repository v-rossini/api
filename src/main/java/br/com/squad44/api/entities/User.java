package br.com.squad44.api.entities;

import javax.persistence.Column;
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
    private Long donatorId;
    @Column(unique = true)
	private String email;
    private String passoword;

    public User() {

    }

    public User(Long parentId, Long donatorId, String email, String password) {
        this.parentId = parentId;
        this.donatorId = donatorId;
        this.email = email;
        this.passoword = new BCryptPasswordEncoder().encode(passoword);
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setDonatorId(Long donatorId) {
        this.donatorId = donatorId;
    }

    public Long getDonatorId() {
        return donatorId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassoword(String passoword) {             
        this.passoword = new BCryptPasswordEncoder().encode(passoword);
    }

    public String getPassoword() {
        return passoword;
    }

}
