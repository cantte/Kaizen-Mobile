package com.kaizen.view.ui.activities

import android.Manifest
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kaizen.R

class AdministratorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_administrator)

        NavigationUI.setupWithNavController(
            findViewById<BottomNavigationView>(R.id.bnv_bottom_menu),
            Navigation.findNavController(this, R.id.fr_administrator_main_content)
        )

        requestPermissions(arrayOf(Manifest.permission.INTERNET), 0)
    }
}
