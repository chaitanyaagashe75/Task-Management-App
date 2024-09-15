package com.example.task.controller;

import com.example.task.dto.TaskDto;
import com.example.task.entity.Task;
import com.example.task.service.TaskService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping()
    public Task create(@RequestBody TaskDto taskDto) {
        return taskService.create(taskDto);
    }

    @PutMapping
    public Task update (@RequestBody TaskDto taskDto) throws BadRequestException {
        return taskService.update(taskDto);
    }

    @GetMapping("/{id}")
    public Task get(@PathVariable String id) throws BadRequestException{
        return taskService.get(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) throws BadRequestException {
        return taskService.delete(id);
    }
}
