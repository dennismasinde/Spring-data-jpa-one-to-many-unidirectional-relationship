package io.tulan.spring.data.jpa.one.to.many.unidirectional.mapping.repository;

import io.tulan.spring.data.jpa.one.to.many.unidirectional.mapping.model.University;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends CrudRepository <University, Long> {
}
