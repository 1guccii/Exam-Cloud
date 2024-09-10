package com.j4kerstudio.examcloud

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.j4kerstudio.examcloud.presentation.component.FacebookButton
import com.j4kerstudio.examcloud.presentation.screen.IntroScreen
import com.j4kerstudio.examcloud.presentation.screen.LoginScreen
import com.j4kerstudio.examcloud.presentation.screen.TextFieldScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TextFieldScreen()
        }
    }
}
