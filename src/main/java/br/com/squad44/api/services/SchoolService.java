package br.com.squad44.api.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.com.squad44.api.dto.SchoolDTO;
import br.com.squad44.api.entities.School;
import br.com.squad44.api.repositories.SchoolRepository;

@Service
public class SchoolService {
	
	@Autowired
	private SchoolRepository repository;
	
	@Transactional(readOnly = true)	
	public List<SchoolDTO>  getList(){
		List<School> list = (List<School>) repository.findAll();
		return list.stream().map(school -> new SchoolDTO(school)).collect(Collectors.toList());		
	}
	
	@Transactional(readOnly = true)	
	public ResponseEntity<SchoolDTO> getById(Long id) {
        Optional<School> school = repository.findById(id);
        if(school.isPresent())       	
            return ResponseEntity.ok(new SchoolDTO(school.get()));
        else return ResponseEntity.notFound().build();
    }
	
	@Transactional(readOnly = true)
    public List<SchoolDTO> getByName(String name) {
    	List<School> list = (List<School>) repository.findByName(name);
    	return list.stream().map(school -> new SchoolDTO(school)).collect(Collectors.toList());
    }
}
