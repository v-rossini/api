package br.com.squad44.api.dto;

import br.com.squad44.api.entities.User;

public class UserDTO {
    
    private Long id;
    private Long parentId;
    private Long donatorId;
	private String email;

    //endereço	
	private String city;
	private String district;
	private String number;
	private String cep;
	private String address;
	private String state;
	
	private String cpf;
    private String name;
    private String phone;

    public UserDTO(User user) {
        this.id = user.getId();
        this.parentId = user.getParent().getId();
        this.donatorId = user.getDonator().getId();
        this.email = user.getEmail();
        
        this.phone = user.getPhone();
        this.name = user.getName();
        this.city = user.getCity();
        this.district = user.getDistrict();
        this.number = user.getNumber();
        this.cep = user.getCep();
        this.address = user.getAddress();
        this.state = user.getState();

        this.cpf = user.getCpf();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    
    public String getDistrict() {
        return district;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getNumber() {
        return number;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

}
