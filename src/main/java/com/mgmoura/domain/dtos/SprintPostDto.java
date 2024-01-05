package com.mgmoura.domain.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class SprintPostDto {
	
	@NotBlank(message = "Informe o NOME da sprint.")
	private String nome;
	
	@NotBlank(message = "Informe a DATA DE INICIO.")
	@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Informe a data de INICIO no formato YYYY-MM-DD.")
	private String dataInicio;
	
	@NotBlank(message = "Informe a DATA DE FIM.")
	@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Informe a data de FIM no formato YYYY-MM-DD.")
	private String dataFim;
	
	@NotNull(message = "Informe o ID.")
	private UUID projetoId; 

}
