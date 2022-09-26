package com.gamecrawl.navigationdrawer

import com.gamecrawl.navigationdrawer.R.drawable.*

sealed class NavigationItem(var route: String, var icon: Int?, var title: String) {

    object Home: NavigationItem(route = "home", ic_home, title = "Home")
    object Profile: NavigationItem(route = "profile", ic_profile, title = "Profile")
    object Nested: NavigationItem(route = "nested", null, title = "Nested")
    object Details: NavigationItem(route = "details", ic_settings, title = "Details")

}
