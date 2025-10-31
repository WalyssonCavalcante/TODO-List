<h1 align="center">Todo-List</h1>

<p align="center">
  Uma aplicação de gerenciamento de tarefas construída com Java puro, oferecendo uma interface de linha de comando simples e eficiente.
</p>

<p align="center">
  <img alt="License" src="https://img.shields.io/badge/license-MIT-blue.svg"/>
  <img alt="Java" src="https://img.shields.io/badge/Java-17-orange.svg"/>
</p>

## 📝 Sobre o Projeto

O Todo-List é uma aplicação de gerenciamento de tarefas desenvolvida em Java puro. O projeto segue os princípios de arquitetura em camadas (Controller, Service, Repository, Model), proporcionando uma estrutura organizada e escalável para gerenciar suas tarefas diárias de forma eficiente através da linha de comando.

Este é um projeto pessoal que demonstra boas práticas de desenvolvimento Java, incluindo separação de responsabilidades, organização de código e padrões de design orientado a objetos.

## ✨ Funcionalidades

- **Adicionar Tarefa**: Crie novas tarefas com descrição personalizada
- **Listar Tarefas**: Visualize todas as suas tarefas cadastradas com status de conclusão
- **Completar Tarefa**: Marque tarefas como concluídas através do ID
- **Deletar Tarefa**: Selecione o ID da tarefa que deseja e delete
- **Interface CLI**: Interação através de linha de comando simples e intuitiva
- **Arquitetura em Camadas**: Código organizado seguindo padrões de design


## 📁 Estrutura do Projeto

Todo-List/
├── src/ 
│   └── main/ 
│       └── todo/ 
│           ├── Main.java 
│           ├── controller/ 
│           │   └── TaskController.java 
│           ├── model/ │           
│   └── Task.java │           
├── repository/ │           
│   └── TaskRepository.java 
│           └── service/ 
│               └── TaskService.java 
├── out/ 
├── .idea/ 
├── .gitignore 
├── Todo-List.iml 
└── README.md
