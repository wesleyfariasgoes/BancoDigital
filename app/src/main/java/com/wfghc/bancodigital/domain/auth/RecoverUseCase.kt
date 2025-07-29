package com.wfghc.bancodigital.domain.auth

import com.wfghc.bancodigital.data.repository.auth.AuthFirebaseDataSourceImpl

class RecoverUseCase(
    private val authFirebaseDataSourceImpl: AuthFirebaseDataSourceImpl
) {
    suspend operator fun invoke(email: String) {
        return authFirebaseDataSourceImpl.recover(email = email)
    }
}