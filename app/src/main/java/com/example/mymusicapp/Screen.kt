

package com.example.musicappui



import androidx.annotation.DrawableRes
import com.example.mymusicapp.R

sealed class Screen(val title :String, val route : String) {
    sealed class BottomScreen(val bTitle:String, val bRoute: String,@DrawableRes val icons:Int):Screen(bTitle,bRoute){
        object Home: BottomScreen("Home","home",R.drawable.music)
        object Library:BottomScreen("Library","library", R.drawable.baseline_library_music_24)
        object Browse: BottomScreen("browse","browse",R.drawable.baseline_apps_24)
    }

    sealed class DrawerScreen(val dTitle:String, val dRoute: String, @DrawableRes
    val icon : Int):Screen(dTitle,dRoute){
        object Account :DrawerScreen(
            "Account",
            "account",
            R.drawable.ic_account
        )
        object Subscription:DrawerScreen(
            "Subscription",
            "subscribe",
            R.drawable.ic_subscribe
        )
        object  AddAccount:DrawerScreen(
            "Add Account",
            "add_account",
            R.drawable.baseline_person_add_alt_1_24
        )
    }
}

val screenInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount

)

val screenInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Browse,
    Screen.BottomScreen.Library
)