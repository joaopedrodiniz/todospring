package br.com.joaodiniz.todospring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaodiniz.todospring.entity.Todo;
import br.com.joaodiniz.todospring.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;
    
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    List<Todo> create(Todo todo) {
        return todoService.create(todo);
    }

    List<Todo> list(Todo todo) {
        return todoService.list();
    }

    List<Todo> update(Todo todo) {
        return todoService.update(todo);
    }

    List<Todo> delete(Long id) {
        return todoService.delete(id);
    }



}
