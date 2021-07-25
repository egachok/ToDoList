package com.dmitrydunai;

import java.util.Date;

public class Task {
    private String taskName;
    private Date createdDate = new Date();
    private Status status = Status.PENDING;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", createdDate=" + createdDate +
                ", status=" + status +
                '}';
    }
}