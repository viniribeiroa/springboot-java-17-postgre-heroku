package com.viniribeiroa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniribeiroa.curso.entities.User;

public interface UseRepository extends JpaRepository<User, Long> {

}
