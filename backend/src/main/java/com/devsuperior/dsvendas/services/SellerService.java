package com.devsuperior.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.DTO.SellerDTO;
import com.devsuperior.dsvendas.model.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SellerService {

	private SellerRepository sellerRepository;
	
	public List<SellerDTO> findAll() {
		List<Seller> sellers = sellerRepository.findAll();
		return sellers.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
