package com.rs.rsspring.request;

import com.rs.rsspring.entity.ToDoStatus;
import lombok.Data;

@Data
public class UpdateToDoRequest {
    private String id;
    private ToDoStatus toDoStatus;
}
