package com.example.Primetrade.service;



import com.example.Primetrade.entity.Task;
import com.example.Primetrade.entity.User;
import java.util.List;

public interface TaskService {

    Task createTask(Task task);

    List<Task> getAllTasks();

    List<Task> getTasksByUser(User user);

    void deleteTask(Long id);
    Task updateTask(Long id, Task task);
}
