package br.com.squad44.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.squad44.api.entities.School;

@Repository
public interface SchoolRepository extends CrudRepository<School, Long> {

	@Query("select u from School u where lower(u.name) like lower(concat('%', ?1, '%'))")
	List<School> findByName(String name);
    
	@Query("select u from School u where lower(u.city) like lower(concat('%', ?1, '%'))")
	List<School> findSchoolByCity (String city);

    
}
