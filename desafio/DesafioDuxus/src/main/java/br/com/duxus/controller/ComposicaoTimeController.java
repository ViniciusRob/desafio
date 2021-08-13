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

import br.com.duxus.model.ComposicaoTime;
import br.com.duxus.repository.ComposicaoTimeRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/compTimes")
public class ComposicaoTimeController {
	
	@Autowired
	private ComposicaoTimeRepository repository;
	
	//Consultar todas as CompTimes
		@GetMapping
		public ResponseEntity<List<ComposicaoTime>> findAllCompTimes() {
			return ResponseEntity.ok(repository.findAll());
		}

		// Consultar CompTimes por ID
		@GetMapping("/{id}")
		public ResponseEntity<ComposicaoTime> findByIdCompTimes(@PathVariable long id) {
			return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
		}

		// Cadastrar CompTimes
		@PostMapping
		public ResponseEntity<ComposicaoTime> postCompTimes(@RequestBody ComposicaoTime composicaoTime) {
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(composicaoTime));
		}

		// Editar CompTimes
		@PutMapping
		public ResponseEntity<ComposicaoTime> putCompTimes(@RequestBody ComposicaoTime composicaoTime) {
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(composicaoTime));
		}

		// Excluir CompTimes
		@DeleteMapping("/{id}")
		public void deleteCompTimes(@PathVariable long id) {
			repository.deleteById(id);
		}


}
