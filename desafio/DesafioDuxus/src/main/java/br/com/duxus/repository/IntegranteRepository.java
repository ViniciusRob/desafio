package br.com.duxus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.duxus.model.Integrante;

@Repository
public interface IntegranteRepository extends JpaRepository<Integrante, Long>{

	//metodo para pesquisar pelo nome do integrante ignorando letras maiusculas
	public List<Integrante> findAllByNomeContainingIgnoreCase (String nome);
}
