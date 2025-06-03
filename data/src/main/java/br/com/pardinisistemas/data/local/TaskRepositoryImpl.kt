package br.com.pardinisistemas.data.local

import br.com.pardinisistemas.data.TaskRepository
import br.com.pardinisistemas.data.local.dao.TaskDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(
    private val taskDao: TaskDao
) : TaskRepository {
    override fun getTasks(): Flow<List<TaskEntity>> {
        return taskDao.getTasks()
    }

    suspend fun preloadTasksIfEmpty() {
        val tasks = taskDao.getTasks().first()
        if (tasks.isEmpty()) {
            taskDao.insertAll(
                listOf(
                    TaskEntity(title = "Buy groceries", description = "Milk, eggs, bread", isCompleted = false),
                    TaskEntity(title = "Walk the dog", description = "Evening walk in the park", isCompleted = false),
                    TaskEntity(title = "Call mom", description = "Weekly check-in", isCompleted = false),
                )
            )
        }
    }
}