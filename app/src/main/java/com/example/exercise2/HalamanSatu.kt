package com.example.exercise2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.exercise2.ui.theme.Exercise2Theme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    onSubmitButtonClicked: (MutableList<String>) -> Unit,) {
    var nama by rememberSaveable { mutableStateOf("") }
    var nim by rememberSaveable { mutableStateOf("") }
    var konsentrasi by rememberSaveable { mutableStateOf("") }
    var judul by rememberSaveable { mutableStateOf("") }
    var dosen by rememberSaveable { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        OutlinedTextField(
            value = nama,
            onValueChange = { nama = it },
            label = { Text(text = "Nama") })
        OutlinedTextField(
            value = nim,
            onValueChange = { nim = it },
            label = { Text(text = "NIM") })
        OutlinedTextField(
            value = konsentrasi,
            onValueChange = { konsentrasi = it },
            label = { Text(text = "Konsentrasi") })
        OutlinedTextField(
            value = judul,
            onValueChange = { judul = it },
            label = { Text(text = "Judul Skripsi") })
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = { onSubmitButtonClicked }) {
            Text(text = stringResource(id = R.string.submit))
        }
    }


    @Composable
    fun PreviewHalamanSatu() {
        Exercise2Theme {
            HalamanSatu(onSubmitButtonClicked = {})
        }
    }
}