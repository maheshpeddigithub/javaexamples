package com.ssil.java.service;

import java.util.List;
import java.util.stream.Collectors;

public class TaskService {

    private TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<String> retrieveLengthyTasks() {
        return repository.getTasks().stream()
                .filter(task -> task.length() > 5)
                .collect(Collectors.toList());
    }

}
