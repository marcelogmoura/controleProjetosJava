package com.mgmoura.domain.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgmoura.domain.dtos.MembroEquipeGetDto;
import com.mgmoura.domain.dtos.MembroEquipePostDto;
import com.mgmoura.domain.interfaces.MembroEquipeService;
import com.mgmoura.domain.models.MembroEquipe;
import com.mgmoura.infraestructure.repositories.MembroEquipeRepository;

@Service
public class MembroEquipeServiceImpl implements MembroEquipeService {
	
	@Autowired
	MembroEquipeRepository membroEquipeRepository;
	
	@Override
	public UUID criar(MembroEquipePostDto dto) {
		
		MembroEquipe membroEquipe = new MembroEquipe();
		membroEquipe.setId(UUID.randomUUID());
		membroEquipe.setNome(dto.getNome());
		membroEquipe.setPapel(dto.getPapel());
		membroEquipe.setEquipeId(dto.getEquipeId());
		
		membroEquipeRepository.save(membroEquipe);
		
		return membroEquipe.getId();
	}
	
	@Override
	public List<MembroEquipeGetDto> consultar(UUID equipeId) {
		
		List<MembroEquipeGetDto> result = new ArrayList<MembroEquipeGetDto>();
		
		for(MembroEquipe membroEquipe : membroEquipeRepository.findByEquipe(equipeId)) {
			
			MembroEquipeGetDto dto = new MembroEquipeGetDto();
			dto.setId(membroEquipe.getId());
			dto.setNome(membroEquipe.getNome());
			dto.setPapel(membroEquipe.getPapel());
			dto.setEquipeId(membroEquipe.getEquipeId());
			
			result.add(dto);
		}
		
		return result;
	}
}

