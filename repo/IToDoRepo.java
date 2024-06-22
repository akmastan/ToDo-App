package com.todoapp.ToDoApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todoapp.ToDoApp.model.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{

}
