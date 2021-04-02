package br.com.squad44.api.controllers.form;

import br.com.squad44.api.entities.Order;
import br.com.squad44.api.repositories.StudentRepository;

public class OrderForm {

    private Long studentId;

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public Order convert(StudentRepository studentRepository) {        
        return new Order(studentRepository.findById(studentId).get());
    }
    
}
