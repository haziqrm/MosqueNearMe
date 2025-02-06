package com.example.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.arcgismaps.ApiKey
import com.arcgismaps.ArcGISEnvironment
import com.arcgismaps.LicenseKey
import com.example.app.screens.MainScreen
import com.example.app.ui.theme.MosqueNearMeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setApiKey()

        enableEdgeToEdge()

        setContent {
            MosqueNearMeTheme {
                MainScreen()
            }
        }

    }

    private fun setApiKey() {

        ArcGISEnvironment.apiKey = ApiKey.create("API KEY")
    }

}


