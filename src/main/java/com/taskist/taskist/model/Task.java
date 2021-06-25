package com.taskist.taskist.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import java.time.LocalTime;
//import java.util.Date;

@Entity
public class Task {

  @Id
  @GeneratedValue
  @Column(name = "id")
  private int id;

  private String task;

  private LocalDate date;

  //    public Task(int id, String task) {
  //        this.id = id;
  //        this.task = task;
  //    }

  @Override
  public String toString() {
    return (
      "Task{" + "id=" + id + ", task='" + task + '\'' + ", date=" + date + '}'
    );
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }
}
