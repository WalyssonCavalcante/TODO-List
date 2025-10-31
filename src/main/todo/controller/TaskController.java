package main.todo.controller;

import main.todo.service.TaskService;
import main.todo.model.Task;

import java.util.Scanner;

public class TaskController {
    private final TaskService service;
    private final Scanner scanner = new Scanner(System.in);

    public  TaskController(TaskService service){
        this.service = service;
    }

    public void start(){
        int option;
        do{
            System.out.println("\n===== TO-DO LIST =====");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Completar Tarefa");
            System.out.println("4 - Deletar Tarefas");
            System.out.println("0 - Exit");
            System.out.println("Escolha: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 -> addTask();
                case 2 -> listTask();
                case 3 -> completeTask();
                case 4 -> deleteTask();
            }
        } while (option != 0);
    }

    private void addTask(){
        System.out.println("Titulo: ");
        String title = scanner.nextLine();
        System.out.println("Descrição: ");
        String description = scanner.nextLine();
        service.createTask(title, description);
        System.out.println("Tarefa criada!");
    }

    private void listTask(){
        System.out.println("\n----- Tarefas -----");
        for (Task t : service.listTask()) {
            System.out.printf("[%s] %d - %s (%s)\n",
                    t.isCompleted() ? "X" : " ", t.getId(), t.getTitle(), t.getDescription());
        }
    }

    private void completeTask(){
        System.out.println("Id da tarefa para completar: ");
        Long id = scanner.nextLong();
        service.completeTask(id);
        System.out.println("Tarefa marcada como completa!");
    }

    private void deleteTask(){
        System.out.println("ID da tarefa para deletar: ");
        long id = scanner.nextLong();
        service.deleteTask(id);
        System.out.println("Tarefa deletada!");
    }

}
