package com.min.springboot.web.service;

import com.min.springboot.web.model.Todo;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
	List<Todo> findByUser(String user);

	
	//service.retrieveTodos(name)

	//service.deleteTodo(id);
	//service.retrieveTodo(id)
	//service.updateTodo(todo)
	//service.addTodo(getLoggedInUserName(model), todo.getDesc(), todo.getTargetDate(),false);
}