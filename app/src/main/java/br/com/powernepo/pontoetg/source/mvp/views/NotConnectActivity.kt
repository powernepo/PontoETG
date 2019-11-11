package br.com.powernepo.pontoetg.source.mvp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import br.com.powernepo.pontoetg.R
import br.com.powernepo.pontoetg.databinding.ActivityNotConnectBinding

class NotConnectActivity : AppCompatActivity() {
    lateinit var binding : ActivityNotConnectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupView()

    }

    private fun setupView() {
        binding = DataBindingUtil.setContentView(this,R.layout.activity_not_connect)
    }
}
