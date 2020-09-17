package com.devsuperior.dspesquisa.services;

import java.time.Instant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.devsuperior.dspesquisa.dto.RecordDTO;
import com.devsuperior.dspesquisa.dto.RecordInsertDTO;

public interface RecordService {

	public RecordDTO insertRecord(RecordInsertDTO record);
	public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest);
}
