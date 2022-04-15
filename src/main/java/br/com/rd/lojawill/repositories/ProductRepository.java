package br.com.rd.lojawill.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.lojawill.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, CrudRepository<Product, Long>{

}
