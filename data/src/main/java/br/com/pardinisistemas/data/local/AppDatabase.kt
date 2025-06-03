package br.com.pardinisistemas.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.pardinisistemas.data.local.dao.TaskDao

@Database(entities = [TaskEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}