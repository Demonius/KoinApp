package by.dmitriy.koinapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavHost()
    }

    private fun setupNavHost() {
        val hostFragment =
            supportFragmentManager.findFragmentById(R.id.containerNavigation) as NavHostFragment
        NavigationUI.setupWithNavController(bottomNavController, hostFragment.navController)
    }
}