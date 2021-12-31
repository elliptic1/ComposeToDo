package com.tbse.compose.todo.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.tbse.compose.todo.util.Action
import com.tbse.compose.todo.util.Constants.TASK_ARGUMENT_KEY
import com.tbse.compose.todo.util.Constants.TASK_SCREEN

/**
 * Created by toddsmith on 12/31/21.
 */

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(
            navArgument(TASK_ARGUMENT_KEY) {
                type = NavType.StringType
            }
        )
    ) {

    }
}