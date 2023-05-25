package com.example.composenoteapp.ui.components

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun NoteInputField(
    text: String,
    label: String,
    modifier: Modifier = Modifier,
    maxLines: Int = 1,
    onTextChange: (String) -> Unit
) {
    TextField(
        modifier = modifier,
        value = text,
        label = { Text(text = label) },
        maxLines = maxLines,
        onValueChange = onTextChange,
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = Color.Transparent,
            focusedContainerColor = Color.Transparent
        ),
    )
}
