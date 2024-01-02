package com.mgmoura.infraestructure.repositories;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mgmoura.domain.models.Tarefa;

@Repository
public interface TarefaRepository extends MongoRepository<Tarefa, UUID>{

}
