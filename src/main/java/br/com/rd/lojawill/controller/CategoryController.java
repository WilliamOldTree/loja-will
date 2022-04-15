package br.com.rd.lojawill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rd.lojawill.entities.Category;
import br.com.rd.lojawill.repositories.CategoryRepository;

@Controller
@RequestMapping(value="/categories")
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping
	public  ResponseEntity<List<Category>> findAll(){
		List <Category>categories = categoryRepository.findAll();
		return ResponseEntity.ok().body(categories);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category>findById(@PathVariable Long id){
		Category category = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(category);
	}
	

}//end class
