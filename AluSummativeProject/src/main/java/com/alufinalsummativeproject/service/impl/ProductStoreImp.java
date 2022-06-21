//Author: Pacifique Linda Ikirezi  & Santigie Sankoh
package com.alufinalsummativeproject.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alufinalsummativeproject.domain.Product;
import com.alufinalsummativeproject.repository.ProductRepository;
import com.alufinalsummativeproject.service.ProductStore;



@Service
public class ProductStoreImp implements ProductStore{
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		return (List<Product>) productRepository.findAll();
	}

}
