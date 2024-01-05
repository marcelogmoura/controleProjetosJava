package com.mgmoura.domain.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TarefaPostDto {
	
	@NotBlank(message = "Informe a DESCRIÇÃO.")
	private String descricao;
	
	@NotBlank(message = "Informe o STATUS.")
	private String status;
	
	@NotBlank(message = "Informe o RESPONSÁVEL.")
	private String responsavel;
	
	@NotNull(message = "Informe a SPRINT.")
	private UUID sprintId;

}
