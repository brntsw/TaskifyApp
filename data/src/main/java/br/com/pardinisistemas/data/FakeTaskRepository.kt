package br.com.pardinisistemas.data

import br.com.pardinisistemas.data.local.TaskEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class FakeTaskRepository : TaskRepository {
    override fun getTasks(): Flow<List<TaskEntity>> = flowOf(
        listOf(
            TaskEntity(0, "Study TDD", "This is important to start from TDD", true),
            TaskEntity(1, "Implement list", "", false),
            TaskEntity(2, "Create initial screen", "", false)
        )
    )
}