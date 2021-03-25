package br.com.squad44.api.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.squad44.api.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
