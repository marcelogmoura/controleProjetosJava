package com.mgmoura.domain.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EquipePostDto {

	@NotBlank(message = "Informe o NOME DA EQUIPE")
	private String nome;
	
	@NotNull(message = "Informe o ID do PROJETO")
	private UUID projetoId;
}
