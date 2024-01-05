package com.mgmoura.domain.interfaces;

import java.util.List;
import java.util.UUID;

import com.mgmoura.domain.dtos.MembroEquipeGetDto;
import com.mgmoura.domain.dtos.MembroEquipePostDto;

public interface MembroEquipeService {
	
	UUID criar (MembroEquipePostDto dto);
	
	List<MembroEquipeGetDto> consultar (UUID equipeId);

}
