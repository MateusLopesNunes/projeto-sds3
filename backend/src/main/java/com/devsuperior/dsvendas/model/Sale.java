package com.devsuperior.dsvendas.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_sales")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Integer visited;
	
	@Column(nullable = false)
	private Integer deals;
	
	@Column(nullable = false)
	private BigDecimal amount;
	
	@Column(nullable = false)
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;
}
