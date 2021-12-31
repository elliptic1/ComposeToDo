package com.tbse.compose.todo.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tbse.compose.todo.data.models.ToDoTask

/**
 * Created by toddsmith on 12/7/21.
 */
@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {
    abstract fun toDoDao(): ToDoDao
}