package com.pvb.springboot.veeru.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvb.springboot.veeru.entity.Admin;
import com.pvb.springboot.veeru.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository arepo;

	public void save(Admin a) {
		arepo.save(a);
	}

	public List<Admin> fetchAll() {
		return arepo.findAll();
	}

}
