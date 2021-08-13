package br.com.duxus.controller;

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

import br.com.duxus.model.Integrante;
import br.com.duxus.repository.IntegranteRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/integrantes")
public class IntegranteController {

	@Autowired
	private IntegranteRepository repository;

	//Consultar todos os Integrantes
	@GetMapping
	public ResponseEntity<List<Integrante>> findAllIntegrante() {
		return ResponseEntity.ok(repository.findAll());
	}

	// Consultar Integrante por ID
	@GetMapping("/{id}")
	public ResponseEntity<Integrante> findByIdIntegrante(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	// Consultar Integrante por Nome
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Integrante>> findIntegranteByNome(@PathVariable String nome) {
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}

	// Cadastrar Integrante
	@PostMapping
	public ResponseEntity<Integrante> postIntegrante(@RequestBody Integrante integrante) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(integrante));
	}

	// Editar Integrante
	@PutMapping
	public ResponseEntity<Integrante> putIntegrante(@RequestBody Integrante integrante) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(integrante));
	}

	// Excluir Integrante
	@DeleteMapping("/{id}")
	public void deleteIntegrante(@PathVariable long id) {
		repository.deleteById(id);
	}

}
