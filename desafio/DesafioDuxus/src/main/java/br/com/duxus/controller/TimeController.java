package br.com.duxus.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.duxus.model.Time;
import br.com.duxus.repository.TimeRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/times")
public class TimeController {
	
	@Autowired
	private TimeRepository repository;
	
	// Consultar Todos os Times
	@GetMapping
	public ResponseEntity<List<Time>> findAllTime() {
		return ResponseEntity.ok(repository.findAll());
	}

	// Consultar Time por ID
	@GetMapping("/{id}")
	public ResponseEntity<Time> findByIdTime(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	// Consultar Time por Data
	@GetMapping("/data/{data}")
	public ResponseEntity<List<Time>> findTimeByData(@PathVariable Date data) {
		return ResponseEntity.ok(repository.findAllByData(data));
	}

	// Cadastrar Time
	@PostMapping
	public ResponseEntity<Time> postTime(@RequestBody Time time) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(time));
	}

	// Editar Time
	@PutMapping
	public ResponseEntity<Time> putTime(@RequestBody Time time) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(time));
	}

	// Excluir Time
	@DeleteMapping("/{id}")
	public void deleteTime(@PathVariable long id) {
		repository.deleteById(id);
	}


}
