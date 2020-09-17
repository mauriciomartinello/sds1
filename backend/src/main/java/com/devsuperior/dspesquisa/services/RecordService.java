package com.devsuperior.dspesquisa.services;

import com.devsuperior.dspesquisa.dto.RecordDTO;
import com.devsuperior.dspesquisa.dto.RecordInsertDTO;

public interface RecordService {

	public RecordDTO insertRecord(RecordInsertDTO record);
	
}
