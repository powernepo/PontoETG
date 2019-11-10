package br.com.powernepo.pontoetg.core

import android.app.Activity
import android.content.Context
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

open class Default {

     fun layoutDefault(ACTIVITY_INSTANCE:Activity){
         ACTIVITY_INSTANCE.requestWindowFeature(Window.FEATURE_NO_TITLE)
         ACTIVITY_INSTANCE.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                                           WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

}