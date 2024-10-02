package br.com.joaodiniz.todospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaodiniz.todospring.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    
} 
