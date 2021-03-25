package br.com.squad44.api.controllers.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class StudentForm {
    
    @NotNull @NotEmpty @Length(min = 5)
    private String name;

    @NotNull
    private Long schoolId;

    @NotNull
	private Long parentId;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    
}
