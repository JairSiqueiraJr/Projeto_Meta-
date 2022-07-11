package com.js.projeto_tarefa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.js.projeto_tarefa.domain.Pratic;

@Repository
public interface PraticRepository extends JpaRepository<Pratic,Integer>{
	@Query("SELECT obj  FROM Pratic obj WHERE obj.finalizado = false ORDER BY obj.dataParaFinalizar")
	List<Pratic> findAllOpen();
	@Query("SELECT obj  FROM Pratic obj WHERE obj.finalizado = true ORDER BY obj.dataParaFinalizar")
	List<Pratic> findAllClose(); 
	
	
}
