package com.pvb.springboot.veeru.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pvb.springboot.veeru.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
