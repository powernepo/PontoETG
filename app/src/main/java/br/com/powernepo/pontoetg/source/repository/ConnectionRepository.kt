package br.com.powernepo.pontoetg.source.repository

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import javax.inject.Inject

class ConnectionRepository{

    private var connected : ConnectivityManager

    constructor(context:Context){
        this.connected = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

    fun verifyExistConnection(): Boolean {
        if (connected != null){
            var net = connected.activeNetworkInfo
            return net != null && net.isConnected
        }
        return false
    }


}
