package com.devsuperior.dsvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.DTO.SellerDTO;
import com.devsuperior.dsvendas.services.SellerService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor(onConstructor =  @__(@Autowired))
@RequestMapping(value = "/sellers")
public class SellerController {

	private SellerService sellerService;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO> > findAll() {
		List<SellerDTO> sellers = sellerService.findAll();
		return ResponseEntity.ok(sellers);
	}
}
