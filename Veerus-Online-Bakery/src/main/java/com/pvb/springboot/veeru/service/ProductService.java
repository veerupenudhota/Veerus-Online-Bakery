package com.pvb.springboot.veeru.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvb.springboot.veeru.entity.Product;
import com.pvb.springboot.veeru.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;

	public void saveProduct(Product P) {
		pRepo.save(P);
	}

	public List<Product> getAll() {
		return pRepo.findAll();
	}

	public void deleteById(long id) {
		pRepo.deleteById(id);
	}

	public Optional<Product> fetchById(long id) {
		return pRepo.findById(id);
	}

	public List<Product> getProductByCategoryId(int id) { // based on one category related all products needs to return
		return pRepo.findAllByCategory_Id(id); // this is not inbuilt method ,this is our method own will build in
												// product repository Jpa
	}

	public Object getProByCatId(int id) {
		return pRepo.findAllByCategory_Id(id);
	}

}
