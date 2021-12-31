package com.tbse.compose.todo.navigation

import androidx.navigation.NavHostController
import com.tbse.compose.todo.util.Action
import com.tbse.compose.todo.util.Constants.LIST_SCREEN

/**
 * Created by toddsmith on 12/30/21.
 * Copyright TBSE 2022
 */
class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }
    val task: (Int) -> Unit = { id ->
        navController.navigate("task/$id")
    }
}
