 package com.js.projeto_tarefa.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pratic implements Serializable {
	
	 
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String Descricao;
	private LocalDateTime dataParaFinalizar;
	private boolean finalizado = false;
	public Pratic() {
		super();
 	}
	public Pratic(Integer id, String titulo, String descricao, LocalDateTime dataParaFinalizar, boolean finalizado) {
		super();
		this.id = id;
		this.titulo = titulo;
		Descricao = descricao;
		this.dataParaFinalizar = dataParaFinalizar;
		this.finalizado = finalizado;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public LocalDateTime getDataParaFinalizar() {
		return dataParaFinalizar;
	}
	public void setDataParaFinalizar(LocalDateTime dataParaFinalizar) {
		this.dataParaFinalizar = dataParaFinalizar;
	}
	public boolean getFinalizado() {
		return finalizado;
	}
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pratic other = (Pratic) obj;
		return Objects.equals(id, other.id);
	}
	
	 
}
