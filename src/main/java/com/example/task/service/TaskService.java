package com.example.task.service;

import com.example.task.dto.TaskDto;
import com.example.task.entity.Task;
import org.apache.coyote.BadRequestException;

public interface TaskService {

    Task create(TaskDto taskDto);
    Task update(TaskDto taskDto) throws BadRequestException;
    Task get(String id) throws BadRequestException;
    Task String delete(String id) throws BadRequestException;

}
