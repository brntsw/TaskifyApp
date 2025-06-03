package br.com.pardinisistemas.domain.usecase

import br.com.pardinisistemas.domain.model.Task
import br.com.pardinisistemas.domain.repository.TaskRepository

class GetTasksUseCase(private val repository: TaskRepository) {
    operator fun invoke(): List<Task> {
        return repository.getTasks()
    }
}