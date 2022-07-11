package com.js.projeto_tarefa.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.js.projeto_tarefa.domain.Pratic;
import com.js.projeto_tarefa.services.PraticService;

@RestController
@RequestMapping(value = "/pratics"  )
public class PraticResources {
	@Autowired
	private PraticService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pratic> findById(@PathVariable Integer id){
		Pratic obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	@GetMapping(value = "/open")
	public ResponseEntity<List<Pratic>> listOpen(){
		List<Pratic> list = service.findAllOpen();
		 return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/close")
	public ResponseEntity<List<Pratic>> listClose(){
		List<Pratic> list = service.findAllClose();
		 return ResponseEntity.ok().body(list);
	}
	@GetMapping
	public ResponseEntity<List<Pratic>> listAll(){
		List<Pratic> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@PostMapping
	public ResponseEntity<Pratic> create(@RequestBody Pratic obj){
		obj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
		}
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	 @PutMapping(value = "/{id}")
	 public ResponseEntity<Pratic> update(@PathVariable Integer id, @RequestBody Pratic obj){
		 Pratic newObj = service.update(id, obj);
		 return ResponseEntity.ok().body(newObj);
	 }
}
