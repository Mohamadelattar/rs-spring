package com.rs.rsspring.service;

import com.rs.rsspring.entity.ToDo;
import com.rs.rsspring.entity.ToDoStatus;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IToDoService {
    Flux<ToDo> streamToDos();
    Mono<ToDo> updateStatus(String taskId, ToDoStatus newStatus);
}
