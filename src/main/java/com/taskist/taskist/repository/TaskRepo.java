package com.taskist.taskist.repository;

import com.taskist.taskist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

public interface TaskRepo extends JpaRepository<Task, Integer> {}
