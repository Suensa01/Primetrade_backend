package com.example.Primetrade.service.impl;



import com.example.Primetrade.entity.Task;
import com.example.Primetrade.entity.User;
import com.example.Primetrade.repository.TaskRepository;
import com.example.Primetrade.service.TaskService;
//import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    @Override
    public Task updateTask(Long id, Task task) {

        Task existing = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        existing.setTitle(task.getTitle());
        existing.setDescription(task.getDescription());
        existing.setStatus(task.getStatus());

        return taskRepository.save(existing);
    }

    @Override
    public List<Task> getTasksByUser(User user) {
        return taskRepository.findByUser(user);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}