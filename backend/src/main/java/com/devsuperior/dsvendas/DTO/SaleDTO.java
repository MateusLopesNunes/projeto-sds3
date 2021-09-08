package com.devsuperior.dsvendas.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.devsuperior.dsvendas.model.Sale;
import com.devsuperior.dsvendas.model.Seller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDTO {

	private Long id;
	private Integer visited;
	private Integer deals;
	private BigDecimal amount;
	private LocalDate date;
	private SellerDTO seller;
	
	public SaleDTO(Sale obj) {
		id = obj.getId();
		visited = obj.getVisited();
		deals = obj.getDeals();
		amount = obj.getAmount();
		date = obj.getDate();
		seller = new SellerDTO(obj.getSeller());
	}
}
