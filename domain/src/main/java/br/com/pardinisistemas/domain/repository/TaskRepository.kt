package br.com.pardinisistemas.domain.repository

import br.com.pardinisistemas.domain.model.Task

interface TaskRepository {
    fun getTasks(): List<Task>
}