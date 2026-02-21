package com.example.Primetrade.controller;

import com.example.Primetrade.dto.response.MessageResponse;
import com.example.Primetrade.dto.response.TaskResponse;
import com.example.Primetrade.entity.Task;
import com.example.Primetrade.service.TaskService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // =========================
    // CREATE TASK (USER + ADMIN)
    // =========================
    @PostMapping
    public TaskResponse createTask(@RequestBody Task task) {

        Task savedTask = taskService.createTask(task);

        return new TaskResponse(
                savedTask.getId(),
                savedTask.getTitle(),
                savedTask.getDescription(),
                savedTask.getStatus()
        );
    }

    // =========================
    // GET ALL TASKS (USER + ADMIN)
    // =========================
    @GetMapping
    public List<TaskResponse> getAllTasks() {

        return taskService.getAllTasks()
                .stream()
                .map(t -> new TaskResponse(
                        t.getId(),
                        t.getTitle(),
                        t.getDescription(),
                        t.getStatus()
                ))
                .toList();
    }

    // =========================
    // DELETE TASK
    // =========================
    @DeleteMapping("/{id}")
    public MessageResponse deleteTask(@PathVariable Long id) {

        taskService.deleteTask(id);

        return new MessageResponse("Task deleted successfully");
    }

    // =========================
    // ADMIN ONLY ENDPOINT
    // =========================
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public List<TaskResponse> getAllTasksAdmin() {

        return taskService.getAllTasks()
                .stream()
                .map(t -> new TaskResponse(
                        t.getId(),
                        t.getTitle(),
                        t.getDescription(),
                        t.getStatus()
                ))
                .toList();
    }
}