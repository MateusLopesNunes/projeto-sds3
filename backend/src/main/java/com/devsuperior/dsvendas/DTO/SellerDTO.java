package com.devsuperior.dsvendas.DTO;

import com.devsuperior.dsvendas.model.Seller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerDTO {

	private Long id;
	private String name;	
	
	public SellerDTO(Seller obj) {
		id = obj.getId();
		name = obj.getName();
	}
}
