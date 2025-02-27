package com.pvb.springboot.veeru.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pvb.springboot.veeru.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
