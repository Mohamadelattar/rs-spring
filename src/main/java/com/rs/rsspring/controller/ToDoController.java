package com.rs.rsspring.controller;

import com.rs.rsspring.entity.ToDo;
import com.rs.rsspring.entity.ToDoStatus;
import com.rs.rsspring.manager.ToDoManager;
import com.rs.rsspring.request.CreateToDoRequest;
import com.rs.rsspring.request.UpdateToDoRequest;
import com.rs.rsspring.service.IToDoService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/todos")
public class ToDoController {
    private final IToDoService toDoService;

    public ToDoController(IToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/stream")
    public Flux<ToDo> streamToDos(){
        return toDoService.streamToDos();
    }
    @PostMapping
    public ToDo add(@RequestBody CreateToDoRequest createToDoRequest) {
        return ToDoManager.getInstance().addToDo(new ToDo(null, createToDoRequest.getTitle(), createToDoRequest.getDescription(), ToDoStatus.NEW, createToDoRequest.getSeverity()));
    }
    @PostMapping
    public Mono<ToDo> update(@RequestBody UpdateToDoRequest updateToDoRequest){
        return ToDoManager.getInstance().updateToDo(updateToDoRequest.getId(), updateToDoRequest.getToDoStatus());
    }
}
