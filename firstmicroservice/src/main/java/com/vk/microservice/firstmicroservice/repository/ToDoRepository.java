package com.vk.microservice.firstmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vk.microservice.firstmicroservice.data.ToDoDataObject;

public interface ToDoRepository extends JpaRepository<ToDoDataObject, Long> {

}
