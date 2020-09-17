package com.devsuperior.dspesquisa.services.impl;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspesquisa.dto.RecordDTO;
import com.devsuperior.dspesquisa.dto.RecordInsertDTO;
import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.entities.Record;
import com.devsuperior.dspesquisa.repositories.GameRepository;
import com.devsuperior.dspesquisa.repositories.RecordRepository;
import com.devsuperior.dspesquisa.services.RecordService;

@Service
public class RecordServiceImpl implements RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insertRecord(RecordInsertDTO record) {
		
		Game game = gameRepository.getOne(record.getGameId());
		
		Record entity = new Record();
		entity.setName(record.getName());
		entity.setMoment(Instant.now());
		entity.setAge(record.getAge());
		entity.setGame(game);
		
		repository.save(entity);
		return new RecordDTO(entity);
	}
	
}
