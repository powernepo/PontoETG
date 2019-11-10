package br.com.powernepo.pontoetg.core.mvp

interface MVP {

    interface Presenter<V>{

        fun attachView(view: V)
        fun detachView()
        fun isViewAttached():Boolean
        fun getView():V

    }

}