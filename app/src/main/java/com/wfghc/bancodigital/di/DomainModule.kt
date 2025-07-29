package com.wfghc.bancodigital.di

import com.wfghc.bancodigital.data.repository.auth.AuthFirebaseDataSource
import com.wfghc.bancodigital.data.repository.auth.AuthFirebaseDataSourceImpl
import dagger.Binds
//import dagger.Module

//@Module
abstract class DomainModule {

//    @Binds
    abstract fun bindsAuthRepository(
        authFirebaseDataSourceImpl: AuthFirebaseDataSourceImpl
    ): AuthFirebaseDataSource
}