package com.example.Primetrade.repository;


import  com.example.Primetrade.entity.Task;
import  com.example.Primetrade.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUser(User user);

}