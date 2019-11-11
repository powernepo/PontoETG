package br.com.powernepo.pontoetg.core.services

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import br.com.powernepo.pontoetg.R
import br.com.powernepo.pontoetg.source.repository.ConnectionRepository

class EventReceiverConnection : BroadcastReceiver(){

    lateinit var repository : ConnectionRepository
    override fun onReceive(context: Context, intent: Intent?) {
        repository = ConnectionRepository(context)
        if(repository.verifyExistConnection())
            Toast.makeText(context, R.string.is_connection,Toast.LENGTH_LONG).show()
        else
            Toast.makeText(context,R.string.not_connection,Toast.LENGTH_LONG).show()
    }
}
