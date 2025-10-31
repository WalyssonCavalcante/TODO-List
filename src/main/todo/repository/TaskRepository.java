package main.todo.repository;

import main.todo.model.Task;
import java.util.*;

public class TaskRepository {
    private final Map<Long, Task> database = new HashMap<>();
    private long counter = 1L;

    public Task save (Task task){
        task.setId(counter++);
        database.put(task.getId(), task);
        return task;
    }

    public List<Task> findAll(){
        return new ArrayList<>(database.values());
    }
    public Optional<Task> findById(long id){
        return Optional.ofNullable(database.get(id));
    }
    public void delete(Long id){
        database.remove(id);
    }
}
