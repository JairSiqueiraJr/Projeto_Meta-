package com.js.projeto_tarefa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.js.projeto_tarefa.services.Db_Services;

@Configuration
@Profile("test")
public class TesteConfig {

	@Autowired
	private Db_Services dbService;
	@Bean
	public boolean instancia() {
		this.dbService.instanciaBaseDeDados();
		return true;
	}
}
