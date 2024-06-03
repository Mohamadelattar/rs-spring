package com.rs.rsspring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDo {
    private String taskId;
    private String title;
    private String description;
    private ToDoStatus toDoStatus;
    private Severity severity;


}

