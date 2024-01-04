package com.mgmoura.domain.interfaces;

import java.util.List;
import java.util.UUID;

import com.mgmoura.domain.dtos.ProjetoGetDto;
import com.mgmoura.domain.dtos.ProjetoPostDto;

public interface ProjetoService {
	
	UUID criar(ProjetoPostDto dto);
	
	List<ProjetoGetDto> consultar();

}
