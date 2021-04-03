package br.com.squad44.api.controllers.form;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserAuthForm {
    
    @NotNull @NotEmpty
    private String email;
    
    @NotNull @NotEmpty
    private String password;

    public void setEmail(String email) {
        if(isValidEmailAddress(email))
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

    public static boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            System.out.println(ex.getMessage());
            result = false;
        }
        return result;
    }
    
}
