package com.example.bilal_custom_calander

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bilal_calander.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          Toaster.Toastview(this)


    }
}