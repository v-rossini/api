package br.com.squad44.api.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.squad44.api.dto.SchoolDTO;

public interface SchoolService {

    public List<SchoolDTO>  getList();

    public ResponseEntity<SchoolDTO> getById(Long id);

    public List<SchoolDTO> getByName(String name);

    public List<SchoolDTO> getByCity(String city);
}
