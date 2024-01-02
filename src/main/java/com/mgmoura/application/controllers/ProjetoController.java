package com.mgmoura.application.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mgmoura.domain.dtos.ProjetoPostDto;
import com.mgmoura.domain.interfaces.ProjetoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/projeto")
public class ProjetoController {
	
	@Autowired
	ProjetoService projetoService;
	
	@PostMapping
	public UUID post(@RequestBody @Valid ProjetoPostDto dto) {
		return projetoService.criar(dto);
	}
	
	@GetMapping
	public void get() {
		
	}

}
