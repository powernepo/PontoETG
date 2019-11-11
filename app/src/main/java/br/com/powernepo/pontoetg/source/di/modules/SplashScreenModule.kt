package br.com.powernepo.pontoetg.source.di.modules

import dagger.Module
import javax.inject.Inject

@Module
class SplashScreenModule {

    @Inject
    fun getString():String{
        return "Lucas Santos"
    }
}