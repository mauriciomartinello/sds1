package com.devsuperior.dspesquisa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dspesquisa.dto.RecordDTO;
import com.devsuperior.dspesquisa.dto.RecordInsertDTO;
import com.devsuperior.dspesquisa.services.RecordService;

@RestController
@RequestMapping(value = "/v1/record")
public class RecordController {

	@Autowired
	private RecordService recordService;

	@PostMapping
	public ResponseEntity<RecordDTO> inserRecord(@RequestBody RecordInsertDTO record){
		
		RecordDTO newRecord = recordService.insertRecord(record);
		
		return ResponseEntity.ok().body(newRecord);
	}
	
}
