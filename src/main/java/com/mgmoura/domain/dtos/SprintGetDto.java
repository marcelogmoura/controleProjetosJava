package com.mgmoura.domain.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class SprintGetDto {
	
	private UUID id;
	private String nome;
	private String dataInicio;
	private String dataFim;
	private UUID projetoId;

}
