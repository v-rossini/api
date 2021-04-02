package br.com.squad44.api.controllers.form;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.squad44.api.entities.Item;
import br.com.squad44.api.entities.ItemOrder;
import br.com.squad44.api.entities.Order;
import br.com.squad44.api.repositories.ItemOrderRepository;
import br.com.squad44.api.repositories.ItemRepository;
import br.com.squad44.api.repositories.StudentRepository;

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

    public Order convert(ItemOrderRepository itemOrderRepository, StudentRepository studentRepository) {        
        return new Order(items.stream().map(item -> itemOrderRepository.findById(item).get()).collect(Collectors.toList()),
                        studentRepository.findById(studentId).get());
    }
    
}
