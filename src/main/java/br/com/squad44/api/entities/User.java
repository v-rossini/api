package br.com.squad44.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Table(name = "tb_user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne(optional = true, mappedBy = "user")
    private Parent parent;
    
    @OneToOne(optional = true, mappedBy = "user")
    private Donator donator;
    
    @Column(unique = true)
	private String email;
    private String password;

    //endereço	
	private String city;
	private String district;
	private String number;
	private String cep;
	private String address;
	private String state;
	
	@Column(unique = true)
	private String cpf;

	private String name;
	private String phone;
	

    public User() {

    }

	public User(Parent parent, Donator donator, String email, String password, String city, String district, String number, 
				String cep, String address, String state, String cpf, String name, String phone) {
		
		this.parent = parent;
		this.donator = donator;
		
		this.email = email;
		this.password = new BCryptPasswordEncoder().encode(password);

		this.city = city;
		this.district = district;
		this.number = number;
		this.cep = cep;
		this.address = address;
		this.state = state;

		this.cpf = cpf;
		this.name = name;
		this.phone = phone;
	}

    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}


	public Parent getParent() {
		return parent;
	}


	public void setParent(Parent parent) {
		this.parent = parent;
	}



	public Donator getDonator() {
		return donator;
	}


	public void setDonator(Donator donator) {
		this.donator = donator;
	}



	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public void setPassword(String password) {             
        this.password = new BCryptPasswordEncoder().encode(password);
    }

    public String getPassword() {
        return password;
    }

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
