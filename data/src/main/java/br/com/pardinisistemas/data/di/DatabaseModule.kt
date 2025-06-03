package br.com.pardinisistemas.data.di

import android.content.Context
import androidx.room.Room
import br.com.pardinisistemas.data.TaskRepository
import br.com.pardinisistemas.data.local.AppDatabase
import br.com.pardinisistemas.data.local.TaskRepositoryImpl
import br.com.pardinisistemas.data.local.dao.TaskDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "task_db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideTaskDao(db: AppDatabase): TaskDao = db.taskDao()

    @Provides
    fun provideTaskRepository(taskDao: TaskDao): TaskRepository =
        TaskRepositoryImpl(taskDao)
}