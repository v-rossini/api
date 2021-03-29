package br.com.squad44.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.squad44.api.controllers.form.StudentForm;
import br.com.squad44.api.services.StudentService;

@SpringBootTest
public class StudentServiceTest {

    @Autowired
    StudentService service;

    @Test
    public void registerTest() {
        StudentForm form = new StudentForm("Fulano da Silva",1L,1L);
        assertEquals(200, service.register(form).getStatusCode().value());
    }

    @Test
    public void getByIdTest() {
        StudentForm form = new StudentForm("Fulano da Silva",1L,1L);
        service.register(form);        
    }
}