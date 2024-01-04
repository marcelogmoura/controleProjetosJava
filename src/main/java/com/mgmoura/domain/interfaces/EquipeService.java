package com.mgmoura.domain.interfaces;

import java.util.List;
import java.util.UUID;

import com.mgmoura.domain.dtos.EquipeGetDto;
import com.mgmoura.domain.dtos.EquipePostDto;

public interface EquipeService {
	
	UUID criar(EquipePostDto dto);
	
	List<EquipeGetDto> consultar(UUID projetoId);

}
