package br.com.powernepo.pontoetg.source.mvp.contract

import android.app.Activity

interface SplashScreenMVP {

    interface View {
        fun onAlertMessage(message:String)
        fun onGoToActivity(activity:Activity)
    }

    interface Model{
        fun isConnected():Boolean
    }


}