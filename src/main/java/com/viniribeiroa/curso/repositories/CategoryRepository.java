package com.viniribeiroa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniribeiroa.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
