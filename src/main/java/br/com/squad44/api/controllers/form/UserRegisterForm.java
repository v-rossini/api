package br.com.squad44.api.controllers.form;

import javax.validation.constraints.NotNull;

import br.com.squad44.api.entities.Donator;
import br.com.squad44.api.entities.Parent;

public class UserRegisterForm {

    @NotNull
    private String email;
    
    @NotNull
    private String password;

    @NotNull
    private String name;
	private String phone;	
	private String city;
    private String address;
	private String state;	
	private String cpf;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
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
    /*
    public Parent convertToParent() {
        return new Parent(name, phone, city, address, state, cpf);
    }

    public Donator convertToDonator() {
        return new Donator(name, phone, city, address, state, cpf);
    }
	*/
}
