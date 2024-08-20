package com.example.hotelloginsystem.nav


sealed class Screens(val route: String) {
    data object DashboardScreen:Screens(route = "dashboard_screen")
    data object MainScreen:Screens(route = "main_screen")
    data object AddDataScreen:Screens(route = "add_data_screen")
    data object GetDataScreen:Screens(route = "get_data_screen")
}
