package br.com.squad44.api.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.squad44.api.dto.ItemDTO;
import br.com.squad44.api.entities.Item;
import br.com.squad44.api.repositories.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	ItemRepository repository;
	
	
	@Transactional(readOnly = true)	
	public List<ItemDTO>  getList(){
		List<Item> list = (List<Item>) repository.findAll();
		return list.stream().map(item -> new ItemDTO(item)).collect(Collectors.toList());		
	}
	
	@Transactional(readOnly = true)	
	public ResponseEntity<ItemDTO> getById(Long id) {
        Optional<Item> item = repository.findById(id);
        if(item.isPresent()) {
        	return ResponseEntity.ok(new ItemDTO(item.get()));
        }
        else 
        	return ResponseEntity.notFound().build();
    }
	
	@Transactional(readOnly = true)
    public List<ItemDTO> getByName(String name) {
    	List<Item> list = (List<Item>) repository.findItemByProduct(name);
    	return list.stream().map(item -> new ItemDTO(item)).collect(Collectors.toList());
}

}
