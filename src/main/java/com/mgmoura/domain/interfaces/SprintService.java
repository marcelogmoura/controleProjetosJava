package com.mgmoura.domain.interfaces;

import java.util.List;
import java.util.UUID;

import com.mgmoura.domain.dtos.SprintGetDto;
import com.mgmoura.domain.dtos.SprintPostDto;

public interface SprintService {
	
	UUID criar(SprintPostDto dto);
	
	List<SprintGetDto> consultar(UUID projetoId);

}
