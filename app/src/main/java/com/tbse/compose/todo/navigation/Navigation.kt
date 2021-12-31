package com.tbse.compose.todo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.tbse.compose.todo.navigation.destinations.listComposable
import com.tbse.compose.todo.navigation.destinations.taskComposable
import com.tbse.compose.todo.util.Constants.LIST_SCREEN

/**
 * Created by toddsmith on 12/31/21.
 * Copyright TBSE 2022
 */

@Composable
fun SetupNavigation(
    navController: NavHostController
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToListScreen = screen.list
        )

    }
}