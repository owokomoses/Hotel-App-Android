package com.example.hotelloginsystem.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.hotelloginsystem.nav.Screens

@Composable
fun MainScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp, vertical = 100.dp),
        verticalArrangement = Arrangement.spacedBy(30.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Button to navigate to Dashboard
        Button(
            onClick = { navController.navigate(Screens.DashboardScreen.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Dashboard")
        }

        // Button to navigate to Get Data Screen
        Button(
            onClick = { navController.navigate(Screens.GetDataScreen.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Create User Data")
        }
    }
}
