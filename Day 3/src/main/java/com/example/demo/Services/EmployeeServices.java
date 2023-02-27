package com.example.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;

@Service
public class EmployeeServices {
  @Autowired
  EmployeeRepo repository;
 public Optional<Employee> getemployee(int id)
 {
	 return repository.findById(id);
 }
 }
