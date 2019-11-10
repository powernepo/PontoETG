package br.com.powernepo.pontoetg.source.mvp.model

import br.com.powernepo.pontoetg.source.mvp.contract.SplashScreenMVP
import br.com.powernepo.pontoetg.source.repository.ConnectionRepository

class SplashScreenModel(
    var connection:ConnectionRepository
) :   SplashScreenMVP.Model{

    override fun isConnected():Boolean = connection.verifyExistConnection()
}
