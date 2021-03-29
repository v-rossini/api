package br.com.squad44.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.squad44.api.controllers.form.StudentForm;
import br.com.squad44.api.entities.Student;

@SpringBootTest
public class StudentServiceTest {

    @Test
    public void registerTest() {
        StudentForm student = new StudentForm("Fulano da Silva",1L,1L);
    }
}