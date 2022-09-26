package com.gamecrawl.navigationdrawer

import com.gamecrawl.navigationdrawer.R.drawable.*

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {

    object Home: NavigationItem(route = "home", ic_home, title = "Home")
    object Profile: NavigationItem(route = "profile", ic_profile, title = "Profile")
    object Settings: NavigationItem(route = "settings", ic_settings, title = "Settings")
    object Share: NavigationItem(route = "share", ic_share, title = "Share")
    object Contact: NavigationItem(route = "contact", ic_contact, title = "Contact")

}
