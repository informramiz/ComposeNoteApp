package com.example.composenoteapp.ui.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composenoteapp.R
import com.example.composenoteapp.ui.components.NoteInputField
import com.example.composenoteapp.ui.theme.ComposeNoteAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.app_name))
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        }
    ) { contentPadding ->
        Box(modifier = Modifier.padding(contentPadding)) {
            NoteScreenContent()
        }
    }
}

@Composable
fun NoteScreenContent() {
    Column(
        modifier = Modifier.padding(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AddNote(modifier = Modifier.padding(10.dp))
    }
}

@Composable
fun AddNote(modifier: Modifier = Modifier) {
    var title by rememberSaveable {
        mutableStateOf("")
    }

    var note by rememberSaveable {
        mutableStateOf("")
    }

    Column(
        modifier = modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .border(width = 1.dp, color = Color.LightGray, shape = RoundedCornerShape(6.dp)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        NoteInputField(
            text = title,
            label = stringResource(R.string.note_screen_title_text_field_label)
        ) { newTitle ->
            title = newTitle
        }

        NoteInputField(
            text = note,
            label = stringResource(R.string.note_screen_note_description_text_field_label)
        ) { newNote ->
            note = newNote
        }

        TextButton(
            modifier = Modifier.padding(10.dp),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.textButtonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            ),
            contentPadding = PaddingValues(horizontal = 30.dp)
        ) {
            Text(text = stringResource(R.string.note_screen_save_button_label))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NoteScreenPreview() {
    ComposeNoteAppTheme {
        NoteScreen()
    }
}
