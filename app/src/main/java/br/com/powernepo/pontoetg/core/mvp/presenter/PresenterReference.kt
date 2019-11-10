package br.com.powernepo.pontoetg.core.mvp.presenter

import br.com.powernepo.pontoetg.core.mvp.MVP
import java.lang.ref.WeakReference

abstract class PresenterReference<V> : MVP.Presenter<V>{
    private var view : WeakReference<V>? = null
    override fun attachView(view: V) {  this.view = WeakReference(view) }
    override fun detachView() { this.view = null }
    override fun isViewAttached(): Boolean = this.view != null && this.view!!.get() != null
    override fun getView(): V = view?.get()!!
}
