package com.tbse.compose.todo.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tbse.compose.todo.util.Constants.DATABASE_TABLE

/**
 * Created by toddsmith on 12/7/21.
 * Copyright TBSE 2017
 */
@Entity(tableName = DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)
