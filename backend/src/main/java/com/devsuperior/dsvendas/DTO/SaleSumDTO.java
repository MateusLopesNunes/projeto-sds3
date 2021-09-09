package com.devsuperior.dsvendas.DTO;

import java.math.BigDecimal;

import com.devsuperior.dsvendas.model.Seller;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SaleSumDTO {

	private String sellerName;
	private BigDecimal sum;
	
	public SaleSumDTO(Seller seller, BigDecimal sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}
}
