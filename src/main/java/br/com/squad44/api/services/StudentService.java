package br.com.squad44.api.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.squad44.api.controllers.form.StudentForm;
import br.com.squad44.api.dto.StudentDTO;

public interface StudentService {

    public ResponseEntity<StudentDTO> register(StudentForm form);

    public List<StudentDTO> getList();

    public ResponseEntity<StudentDTO> getById(Long id);
}
