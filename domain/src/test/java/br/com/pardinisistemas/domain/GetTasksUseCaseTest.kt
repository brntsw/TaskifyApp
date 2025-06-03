package br.com.pardinisistemas.domain

import br.com.pardinisistemas.domain.model.Task
import br.com.pardinisistemas.domain.repository.TaskRepository
import br.com.pardinisistemas.domain.usecase.GetTasksUseCase
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class GetTasksUseCaseTest {

    private lateinit var useCase: GetTasksUseCase
    private lateinit var repository: TaskRepository

    @Before
    fun setup() {
        repository = FakeTaskRepository()
        useCase = GetTasksUseCase(repository)
    }

    @Test
    fun `Should return list of tasks`() {
        val tasks = useCase()
        Assert.assertEquals(2, tasks.size)
        Assert.assertEquals("Do laundry", tasks[0].title)
    }

    class FakeTaskRepository : TaskRepository {
        override fun getTasks(): List<Task> {
            return listOf(
                Task("1", "Do laundry", false),
                Task("2", "Write report", true)
            )
        }
    }
}