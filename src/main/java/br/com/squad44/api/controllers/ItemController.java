package br.com.squad44.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.dto.ItemDTO;
import br.com.squad44.api.services.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
    
    @Autowired
    ItemService service;
    
    @GetMapping()
    public List<ItemDTO> getList(){
        return  service.getList();
    }
    
    @GetMapping("/pages")
    public Page<ItemDTO> getPages(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "0") Integer linesPerPage
			){
		
		if (linesPerPage == 0) {
			linesPerPage = Integer.MAX_VALUE;
		}
		
		PageRequest pageRequest = PageRequest.of(page, linesPerPage);
        return  service.getPages(pageRequest);
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<ItemDTO> getById(@PathVariable Long id) {
    	return service.getById(id);
    }

    @GetMapping("/search")
    public List<ItemDTO> getByName(@RequestParam("name") String name) {
        return service.getByName(name);
    }

}
