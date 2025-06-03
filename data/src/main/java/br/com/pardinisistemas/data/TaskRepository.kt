package br.com.pardinisistemas.data

import br.com.pardinisistemas.data.local.TaskEntity
import kotlinx.coroutines.flow.Flow

interface TaskRepository {
    fun getTasks(): Flow<List<TaskEntity>>
}