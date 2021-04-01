package br.com.squad44.api.controllers.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserAuthForm {
    
    @NotNull @NotEmpty
    private String email;
    
    @NotNull @NotEmpty
    private String password;

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
    
}
