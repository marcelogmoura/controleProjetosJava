package com.mgmoura.domain.models;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collation = "membroequipe")
public class MembroEquipe {
	
	@Id
	private UUID id;
	private String nome;
	private String papel;

}