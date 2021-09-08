package com.devsuperior.dsvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.DTO.SaleDTO;
import com.devsuperior.dsvendas.services.SaleService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor(onConstructor =  @__(@Autowired))
@RequestMapping(value = "/sales")
public class SaleController {

	private SaleService saleService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO> > findAll(Pageable pageable) {
		Page<SaleDTO> sellers = saleService.findAll(pageable);
		return ResponseEntity.ok(sellers);
	}
}
