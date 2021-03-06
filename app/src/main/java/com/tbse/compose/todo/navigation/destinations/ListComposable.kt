package com.tbse.compose.todo.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.tbse.compose.todo.ui.screens.list.ListScreen
import com.tbse.compose.todo.util.Constants.LIST_ARGUMENT_KEY
import com.tbse.compose.todo.util.Constants.LIST_SCREEN

/**
 * Created by toddsmith on 12/31/21.
 */

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(
            navArgument(LIST_ARGUMENT_KEY) {
                type = NavType.StringType
            }
        )
    ) {
        ListScreen(navigateToTaskScreen = navigateToTaskScreen)
    }
}