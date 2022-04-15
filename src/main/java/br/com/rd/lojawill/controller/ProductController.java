package br.com.rd.lojawill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rd.lojawill.entities.Product;
import br.com.rd.lojawill.repositories.ProductRepository;

@Controller
@RequestMapping(value="/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public  ResponseEntity<List<Product>> findAll(){
		List<Product> products = productRepository.findAll();
		return ResponseEntity.ok().body(products);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product>findById(@PathVariable Long id){
		Product product = productRepository.findById(id).get();
		return ResponseEntity.ok().body(product);
	}
	
}//end class
