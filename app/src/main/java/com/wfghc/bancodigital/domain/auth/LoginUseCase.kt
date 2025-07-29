package com.wfghc.bancodigital.domain.auth

import com.wfghc.bancodigital.data.repository.auth.AuthFirebaseDataSourceImpl

class LoginUseCase(
    private val authFirebaseDataSourceImpl: AuthFirebaseDataSourceImpl
) {
    suspend operator fun invoke(email: String, password: String) {
        return authFirebaseDataSourceImpl.login(email, password)
    }
}