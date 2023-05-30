package com.example.sampanah_01

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp



@Composable
fun HomeScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally ) {
        Text(modifier = Modifier.fillMaxWidth(), text = "HomeScreen")
        var text1 by remember { mutableStateOf("") }
        var text2 by remember { mutableStateOf("") }
        var message by remember { mutableStateOf("") }

        TextField(
            value = text1,
            onValueChange = { text1 = it },
            label = { Text("Enter your username") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = text2,
            onValueChange = { text2 = it },
            label = { Text("Enter your password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                if (text1 == "user1" && text2 == "2023") {
                    navController.navigate(Second.Route)
                } else {
                    message = "User or Password Wrong"
                }
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Enter")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(message)


    }
}
