package main.todo;

import main.todo.controller.TaskController;
import main.todo.repository.TaskRepository;
import main.todo.service.TaskService;

public class Main {
    static void main() {
        TaskRepository repository = new TaskRepository();
        TaskService service = new TaskService(repository);
        TaskController controller = new TaskController(service);

        controller.start();
    }
}
