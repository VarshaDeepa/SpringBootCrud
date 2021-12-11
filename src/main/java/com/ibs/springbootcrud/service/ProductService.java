
package com.ibs.springbootcrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.springbootcrud.model.Product;
import com.ibs.springbootcrud.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	public ProductRepository productRepository;

	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}
	public Product getProductById(Long id)
	{
		return productRepository.findById(id).get();
	}

	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public void updateProduct(Long id, Product product) {
		productRepository.save(product);

	}

	public void deleteProduct(Long id) {
		productRepository.deleteById(id);

	}

}
