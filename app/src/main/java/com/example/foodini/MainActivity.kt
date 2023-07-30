package com.example.foodini

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            HideActionBar()
            MainContainerDraw()
        }
    }
    @Composable
    private fun HideActionBar(){
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        val systemUiController = rememberSystemUiController()
        systemUiController.setSystemBarsColor(
            color = Color.Transparent
        )
    }
    @Composable
    private fun MainContainerDraw(){
        Box(modifier = Modifier.fillMaxSize()){
            SetBackground()
            Column(
                Modifier
                    .fillMaxSize()
                    .systemBarsPadding()) {

            }
        }
    }
    @Composable
    private fun SetBackground(){
        Box(
            Modifier
                .fillMaxSize()) {
            Image(
                painterResource(id = R.drawable.foodini_background),
                contentDescription = "...",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}