package main.todo.service;

import main.todo.model.Task;
import main.todo.repository.TaskRepository;

import java.util.List;

public class TaskService {
    private final TaskRepository repository;

    public  TaskService(TaskRepository repository){
        this.repository = repository;
    }

    public Task createTask(String title, String description){
        if (title == null || title.isBlank()){
            throw new IllegalArgumentException("Tittle cannot be empty");
        }
        return  repository.save(new Task(null, title, description));
    }

    public List<Task> listTask(){
        return repository.findAll();
    }

    public void completeTask(Long id){
        repository.findById(id).ifPresent(task -> task.setCompleted(true));
    }

    public void deleteTask(Long id){
        repository.delete(id);
    }
}
