package com.mgmoura.domain.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgmoura.domain.dtos.EquipeGetDto;
import com.mgmoura.domain.dtos.EquipePostDto;
import com.mgmoura.domain.interfaces.EquipeService;
import com.mgmoura.domain.models.Equipe;
import com.mgmoura.infraestructure.repositories.EquipeRepository;

@Service
public class EquipeServiceImpl implements EquipeService{
	
	@Autowired
	EquipeRepository equipeRepository;

	@Override
	public UUID criar(EquipePostDto dto) {
		
		Equipe equipe = new Equipe();
		equipe.setId(UUID.randomUUID());
		equipe.setNome(dto.getNome());
		equipe.setProjetoId(dto.getProjetoId());
		
		equipeRepository.save(equipe);
				
		return equipe.getId();
	}

	@Override
	public List<EquipeGetDto> consultar(UUID projetoId) {
		
		List<EquipeGetDto> result = new ArrayList<EquipeGetDto>();
		
		for(Equipe equipe : equipeRepository.findByProjeto(projetoId)) {
			
			EquipeGetDto dto = new EquipeGetDto();
			dto.setId(equipe.getId());
			dto.setNome(equipe.getNome());
			dto.setProjetoId(equipe.getProjetoId());
			
			result.add(dto);
		}
		
		return result;
	}
}





