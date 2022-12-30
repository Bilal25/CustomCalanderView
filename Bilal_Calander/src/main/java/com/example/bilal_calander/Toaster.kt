package com.example.bilal_calander

import android.content.Context
import android.widget.Toast

class Toaster {

    companion object{
        fun Toastview(ctx : Context){
            Toast.makeText(ctx,"Code copied", Toast.LENGTH_SHORT).show()
        }
    }



}