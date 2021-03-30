package br.com.squad44.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.dto.ItemDTO;
import br.com.squad44.api.repositories.ItemRepository;
import br.com.squad44.api.services.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
    
    @Autowired
    ItemRepository itemRepository;
    
    @Autowired
    ItemService service;
    
    @GetMapping
    public List<ItemDTO> getList() {
        return  service.getList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemDTO> getById(@PathVariable Long id) {
    	ResponseEntity<ItemDTO> item = service.getById(id);
    	return item;
    }

    @GetMapping("/search")
    public List<ItemDTO> getByName(@RequestParam("name") String name) {
        List<ItemDTO> list = service.getByName(name);
        return list;
    }
}
