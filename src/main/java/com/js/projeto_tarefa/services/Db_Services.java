package com.js.projeto_tarefa.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.projeto_tarefa.domain.Pratic;
import com.js.projeto_tarefa.repositories.PraticRepository;

@Service
public class Db_Services {

	@Autowired
	private PraticRepository praticRepository;

	public void instanciaBaseDeDados() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Pratic t1 = new Pratic(null, "Estudar", "Estudar Spring Boot 2 e Angular ",
				LocalDateTime.parse("26/06/2022 20:30", formatter), true);
		
		
		
		praticRepository.saveAll(Arrays.asList(t1));
	}
}
