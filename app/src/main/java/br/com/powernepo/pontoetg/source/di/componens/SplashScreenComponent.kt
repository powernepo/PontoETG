package br.com.powernepo.pontoetg.source.di.componens

import br.com.powernepo.pontoetg.source.di.modules.SplashScreenModule
import br.com.powernepo.pontoetg.source.mvp.views.SplashScreenActivity
import dagger.Component

@Component(modules = [SplashScreenModule::class])
interface SplashScreenComponent{

    @Component.Factory
    interface FACTORY {
        fun onCreate():SplashScreenComponent
    }

    fun inject(activity:SplashScreenActivity)
}
