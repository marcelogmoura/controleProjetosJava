package com.mgmoura.infraestructure.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mgmoura.domain.models.MembroEquipe;

@Repository
public interface MembroEquipeRepository extends MongoRepository<MembroEquipe, UUID>{
	
	@Query("{ 'equipeId': ?0 }")
	List<MembroEquipe> findByEquipe(UUID equipeId);

}
