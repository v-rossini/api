package br.com.squad44.api.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;

import br.com.squad44.api.dto.ItemDTO;

public interface ItemService {
    
    public List<ItemDTO>  getList();

    public ResponseEntity<ItemDTO> getById(Long id);

    public List<ItemDTO> getByName(String name);

    public Page<ItemDTO> getPages(PageRequest pageRequest);
}
