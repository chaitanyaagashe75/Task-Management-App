package com.example.task.entity;

import com.example.task.enums.TaskStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Task {

    @Id
    private String id;
//    @Length(min = 5, max = 100, message = "Title must be between 5 and 100 characters")
    private String title;
//    @Length(max = 500, message = "Description cannot exceed 500 characters")
    private String description;

    private Long endDate;

    private String status;
}
