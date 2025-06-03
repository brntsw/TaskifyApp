package br.com.pardinisistemas.data

import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class FakeTaskRepositoryTest {
    private lateinit var repository: FakeTaskRepository

    @Before
    fun setup() {
        repository = FakeTaskRepository()
    }

    @Test
    fun `getTasks returns list of tasks`() = runBlocking {
        val tasks = repository.getTasks().first()
        assertEquals(3, tasks.size)
        assertEquals("Study TDD", tasks[0].title)
    }
}