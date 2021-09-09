package com.devsuperior.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsvendas.DTO.SaleSucessDTO;
import com.devsuperior.dsvendas.DTO.SaleSumDTO;
import com.devsuperior.dsvendas.model.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("select new com.devsuperior.dsvendas.DTO.SaleSumDTO(obj.seller, sum(obj.amount))"
			+ "from Sale as obj group by obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();

	@Query("select new com.devsuperior.dsvendas.DTO.SaleSucessDTO(obj.seller, sum(obj.visited), sum(obj.deals))"
			+ "from Sale as obj group by obj.seller")
	List<SaleSucessDTO> sucessGroupedBySeller();
}
