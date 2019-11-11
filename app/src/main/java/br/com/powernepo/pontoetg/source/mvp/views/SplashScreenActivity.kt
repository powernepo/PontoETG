package br.com.powernepo.pontoetg.source.mvp.views

import android.app.Activity
import android.content.ComponentName
import android.content.Intent
import android.content.pm.ResolveInfo
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.powernepo.pontoetg.R
import br.com.powernepo.pontoetg.source.mvp.contract.SplashScreenMVP
import br.com.powernepo.pontoetg.core.constantes.TAG
import br.com.powernepo.pontoetg.core.constantes.TAG.EVENT_VERIFY_NET
import br.com.powernepo.pontoetg.source.di.componens.DaggerSplashScreenComponent
import javax.inject.Inject

class SplashScreenActivity : AppCompatActivity() , SplashScreenMVP.View{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        sendBroadcast()

    }

    override fun onAlertMessage(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onGoToActivity(activity: Activity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun sendBroadcast(){
        val actionBroadcast = Intent(EVENT_VERIFY_NET)
        val matches = packageManager.queryBroadcastReceivers(actionBroadcast, 0)

        for(information in matches){
            actionBroadcast.component =
                ComponentName(information.activityInfo.packageName,information.activityInfo.name)
            sendBroadcast(actionBroadcast)
        }
    }
}
