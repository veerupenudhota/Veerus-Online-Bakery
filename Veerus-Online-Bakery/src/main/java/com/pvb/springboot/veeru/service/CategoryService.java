package com.pvb.springboot.veeru.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvb.springboot.veeru.entity.Category;
import com.pvb.springboot.veeru.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository crepo;

	public void saveCategory(Category c) {
		crepo.save(c);

	}

	public List<Category> getAll() {
		return crepo.findAll();
	}

	public void deleteById(int id) {
		crepo.deleteById(id);
	}

	public Optional<Category> fetchById(int id) {
		return crepo.findById(id);
	}

}
