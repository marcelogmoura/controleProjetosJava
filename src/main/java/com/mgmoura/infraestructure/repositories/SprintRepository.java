package com.mgmoura.infraestructure.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mgmoura.domain.models.Sprint;

@Repository
public interface SprintRepository extends MongoRepository<Sprint, UUID>{
	
	@Query("{'projetoId' :?0 }")
	List<Sprint> findByProjeto(UUID projetoId);

}
