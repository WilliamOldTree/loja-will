package br.com.rd.lojawill.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rd.lojawill.entities.Category;

@Controller
@RequestMapping(value="/categories")
public class CategoryController {
	
	@GetMapping
	public  ResponseEntity<List<Category>> findAll(){
		return ResponseEntity.ok().body(null);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<List<Category>>findById(@PathVariable Long id){
		return ResponseEntity.ok().body(null);
	}
	

}//end class
