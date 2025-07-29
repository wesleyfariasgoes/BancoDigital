package com.wfghc.bancodigital.presenter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wfghc.bancodigital.R
import com.wfghc.bancodigital.presenter.auth.login.LoginFragment
import com.wfghc.bancodigital.presenter.auth.recovery.RecoveryFragment

//import dagger.hilt.android.AndroidEntryPoint
//
//@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, LoginFragment())
            .commit()
    }
}