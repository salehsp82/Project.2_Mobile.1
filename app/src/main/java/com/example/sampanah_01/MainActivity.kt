package com.example.sampanah_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sampanah_01.ui.theme.Sampanah_01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sampanah_01Theme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    myNavigation()
                }
            }
        }
    }
}

@Composable
fun myNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.Route ){
        composable(Home.Route){
            HomeScreen(navController)
        }
        composable(Second.Route){
            SecendScreen()
        }
    }
}