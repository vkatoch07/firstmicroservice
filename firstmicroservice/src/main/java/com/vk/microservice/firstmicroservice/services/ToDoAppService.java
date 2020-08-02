package com.vk.microservice.firstmicroservice.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.vk.microservice.firstmicroservice.repository.ToDoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.microservice.firstmicroservice.data.ToDoDataObject;

@Service
public class ToDoAppService {

	@Autowired
	private ToDoRepository toDoRepository;

	public List<ToDoDataObject> getAllToDos() {
		return toDoRepository.findAll();
	}

	public ToDoDataObject save(ToDoDataObject dataObject) {
		if (null == dataObject.getId()) {
			toDoRepository.save(dataObject);
		} else {
			deleteToDo(dataObject.getId());
		}

		return dataObject;

	}

	public ToDoDataObject deleteToDo(long id) {

		return toDoRepository.findById(id).get();

	}

	public ToDoDataObject findByUId(long id) {

		return toDoRepository.findById(id).get();
	}

}
