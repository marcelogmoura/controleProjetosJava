package com.mgmoura.infraestructure.repositories;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mgmoura.domain.models.Projeto;

@Repository
public interface ProjetoRepository extends MongoRepository<Projeto, UUID>{

}
