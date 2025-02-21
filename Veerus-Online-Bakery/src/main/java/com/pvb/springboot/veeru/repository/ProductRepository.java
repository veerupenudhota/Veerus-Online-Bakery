package com.pvb.springboot.veeru.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pvb.springboot.veeru.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findAllByCategory_Id(int id);

}
