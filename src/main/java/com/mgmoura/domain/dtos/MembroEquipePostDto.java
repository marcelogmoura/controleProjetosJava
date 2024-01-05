package com.mgmoura.domain.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class MembroEquipePostDto {
	
	@NotBlank(message = "Informe o NOME do membro da equipe")
	private String nome;
	
	@NotBlank(message = "Informe o PAPEL do membro da equipe")
	private String papel;
	
	@NotNull(message = "Informe o ID da equipe")
	private UUID equipeId; 

}
