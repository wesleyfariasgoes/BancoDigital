package com.wfghc.bancodigital.di

import com.google.firebase.database.FirebaseDatabase
import dagger.Module
import dagger.Provides

@Module
class FireBaseModule {

    @Provides
    fun providesFireBaseDataBase(): FirebaseDatabase {
        return FirebaseDatabase.getInstance()
    }


}