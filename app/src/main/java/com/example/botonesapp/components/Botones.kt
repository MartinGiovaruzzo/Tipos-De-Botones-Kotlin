package com.example.botonesapp.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BotonNormal() {
    Button(onClick = { /*TODO*/ }, enabled = false) {
        Text(text = "Mi boton", fontSize = 30.sp)
    }
}

@Composable
fun BotonNormal2() {
    Button(
        onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue
        )
    ) {
        Text(text = "Mi boton", fontSize = 30.sp)
    }
}

@Composable
fun BotonTexto() {
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "Mi boton", fontSize = 30.sp)
    }
}

@Composable
fun BotonOutline() {
    OutlinedButton(onClick = { /*TODO*/ }, border = BorderStroke(3.dp, Color.Cyan)) {
        Text(text = "Mi boton", fontSize = 30.sp)
    }
}

@Composable
fun BotonIcono() {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            Icons.Filled.Call,
            contentDescription = "Icono Call",
            tint = Color.Black,
            modifier = Modifier.size(57.dp)

        )
    }
}

@Composable
fun BotonSwitch() {

    var switeched by remember { mutableStateOf(false) }

    Switch(
        checked = switeched, onCheckedChange = { switeched = it },
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color.Blue,
            checkedTrackColor = Color.Gray,
            uncheckedThumbColor = Color.Blue,
            uncheckedTrackColor = Color.White
        )
    )
}

@Composable
fun DarkMode(darkMode: MutableState<Boolean>) {
    Button(onClick = { darkMode.value = !darkMode.value}) {
        Icon(imageVector = Icons.Default.Warning, contentDescription = "Warning")
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = "Dark Mode", fontSize = 30.sp)
    }
}

@Composable
fun FloatingAction() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        containerColor = Color.Blue,
        contentColor = Color.White
    ) {
        Icon(
            Icons.Filled.Add, contentDescription = "",
            modifier = Modifier.size(30.dp)
        )
    }
}

@Composable
fun Space() {
    Spacer(modifier = Modifier.height(10.dp))
}