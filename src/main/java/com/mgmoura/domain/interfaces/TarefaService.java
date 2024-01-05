package com.mgmoura.domain.interfaces;

import java.util.List;
import java.util.UUID;

import com.mgmoura.domain.dtos.TarefaGetDto;
import com.mgmoura.domain.dtos.TarefaPostDto;

public interface TarefaService {
	
	UUID criar(TarefaPostDto dto);
	
	List<TarefaGetDto> consultar(UUID sprintId);

}
