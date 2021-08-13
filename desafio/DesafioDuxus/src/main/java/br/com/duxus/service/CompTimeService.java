package br.com.duxus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.duxus.repository.ComposicaoTimeRepository;
import br.com.duxus.repository.IntegranteRepository;
import br.com.duxus.repository.TimeRepository;

@Service
public class CompTimeService {
	
	@Autowired
	private ComposicaoTimeRepository compTimeRepository;
	
	@Autowired
	private IntegranteRepository integranteRepository;

	@Autowired
	private TimeRepository timeRepository;
	
	

}
