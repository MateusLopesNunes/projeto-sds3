package com.devsuperior.dsvendas.DTO;

import java.math.BigDecimal;

import com.devsuperior.dsvendas.model.Seller;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SaleSucessDTO {

	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSucessDTO(Seller seller, Long visited, Long deals) {
		this.sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}
	
	
}
