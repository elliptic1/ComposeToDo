package com.tbse.compose.todo.data.models

import androidx.compose.ui.graphics.Color
import com.tbse.compose.todo.ui.theme.HighPriorityColor
import com.tbse.compose.todo.ui.theme.LowPriorityColor
import com.tbse.compose.todo.ui.theme.MediumPriorityColor
import com.tbse.compose.todo.ui.theme.NonePriorityColor

/**
 * Created by toddsmith on 12/7/21.
 * Copyright TBSE 2017
 */
enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}