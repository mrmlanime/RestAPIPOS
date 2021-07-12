package org.yanixmrml.pos.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yanixmrml.pos.rest.model.Product;
import org.yanixmrml.pos.rest.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public ProductService() {
		super();
	}
	
	public List<Product> getProducts(){
		List<Product> productList = new ArrayList<Product>();
		this.productRepository.findAll().forEach(product -> productList.add(product));
		return productList;
	}
	
	public Product getProduct(int productID) {
		return this.productRepository.findById(productID).get();
	}
	
	public void addProduct(Product product) {
		this.productRepository.save(product);
	}
	
	public void updateProduct(Product product) {
		this.productRepository.save(product);
	}
	
	public void deleteProduct(int productID) {
		this.productRepository.deleteById(productID);
	}
}
