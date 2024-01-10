package com.mgmoura;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.mgmoura.domain.dtos.TarefaPostDto;
import com.mgmoura.domain.models.Projeto;
import com.mgmoura.domain.models.Sprint;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TarefaTests {
	

	@Autowired
	MockMvc mockMvc;
	

	@Autowired
	ObjectMapper objectMapper;

	private static UUID sprintId;

	@Test
	@Order(1)
	public void tarefaPostTest() throws Exception {
		
		objectMapper.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
		
		MvcResult result = mockMvc.perform(get("/api/projeto")).andReturn();
		String json = result.getResponse().getContentAsString();
		List<Projeto> projetos = objectMapper.readValue(json, new TypeReference<List<Projeto>>() {
		});
		
		result = mockMvc.perform(get("/api/sprint/" + projetos.get(0).getId())).andReturn();
		json = result.getResponse().getContentAsString();
		
		List<Sprint> sprints = objectMapper.readValue(json, new TypeReference<List<Sprint>>() {
		});
		
		Faker faker = new Faker();
		
		TarefaPostDto dto = new TarefaPostDto();
		
		dto.setDescricao(faker.company().profession());
		dto.setResponsavel(faker.name().fullName());
		dto.setStatus("Entregue");
		dto.setSprintId(sprints.get(0).getId());
		mockMvc.perform(
				post("/api/tarefa").contentType("application/json").content(objectMapper.writeValueAsString(dto)))
				.andExpect(status().isOk());
		sprintId = dto.getSprintId();
	}

	@Test
	@Order(2)
	public void tarefaGetTest() throws Exception {
		mockMvc.perform(get("/api/tarefa/" + sprintId)).andExpect(status().isOk());
	}
}
