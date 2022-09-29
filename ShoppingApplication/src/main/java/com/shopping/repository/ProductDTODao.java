package com.shopping.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.module.ProductDTO;

public interface ProductDTODao extends JpaRepository<ProductDTO, Integer>{

	public Optional<ProductDTO> findByProductId(Integer productId);
	
}
