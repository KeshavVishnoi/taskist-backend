package com.taskist.taskist.resource;

import com.taskist.taskist.model.Task;
import com.taskist.taskist.repository.TaskRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/tasks")
public class TaskResource {

  @Autowired
  TaskRepo taskRepo;

  @RequestMapping("/alltasks")
  public List<Task> getTasks() {
    return taskRepo.findAll();
  }

  @PostMapping(value = "/addtask")
  public List<Task> addTask(@RequestBody Task task) {
    taskRepo.save(task);
    return taskRepo.findAll();
  }

  @PutMapping("/edittask")
  public List<Task> editTask(@RequestBody Task task) {
    if (taskRepo.findById(task.getId()).isPresent()) {
      taskRepo.save(task);
    } else {}
    return taskRepo.findAll();
  }

  @DeleteMapping(value = "/deletetask/{id}")
  public String deleteTask(@PathVariable String id) {
    taskRepo.delete(taskRepo.getById(Integer.parseInt(id)));

    return "Deleted";
  }
}
