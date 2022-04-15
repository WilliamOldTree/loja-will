package br.com.rd.lojawill.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.lojawill.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
