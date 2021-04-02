package br.com.squad44.api.controllers.form;

import java.util.ArrayList;
import java.util.List;

public class OrderForm {

    private List<Long> items = new ArrayList<>();
    private Long studentId;

    public void setItems(List<Long> items) {
        this.items = items;
    }

    public List<Long> getItems() {
        return items;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }
    
}
