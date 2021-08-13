package br.com.duxus.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.duxus.model.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, Long>{
	
	public List<Time> findAllByData (Date data);

}
