package com.tbse.compose.todo.ui.screens.list

import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tbse.compose.todo.ui.theme.topAppBarBackgroundColor
import com.tbse.compose.todo.ui.theme.topAppBarContentColor

/**
 * Created by toddsmith on 12/31/21.
 * Copyright TBSE 2022
 */
@Composable
fun ListAppBar() {
    DefaultListAppBar()
}

@Composable
fun DefaultListAppBar() {
    TopAppBar(
        title = {
            Text(
                text = "Tasks",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor
    )
}

@Composable
fun ListAppBarActions() {

}

@Composable
fun SearchAction(
    onSearchClicked: () -> Unit
) {
    IconButton(onClick = { onSearchClicked() }) {

    }
}

@Composable
@Preview
fun DefaultListAppBarPreview() {
    DefaultListAppBar()
}
