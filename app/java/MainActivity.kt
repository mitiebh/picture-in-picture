package com.mitiebh.pip

import android.app.PictureInPictureParams
import android.graphics.Point
import android.os.Build
import android.os.Bundle
import android.util.Rational
import android.view.Display
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val display:Display = windowManager.defaultDisplay
        val point = Point()
        val button = findViewById<Button>(R.id.btnPIP)
        button.setOnClickListener {
            display.getSize(point)
            val pipParamBuilder = PictureInPictureParams.Builder()
            pipParamBuilder.setAspectRatio(Rational(point.x,point.y)).build()
            enterPictureInPictureMode(pipParamBuilder.build())
        }
    }
}
