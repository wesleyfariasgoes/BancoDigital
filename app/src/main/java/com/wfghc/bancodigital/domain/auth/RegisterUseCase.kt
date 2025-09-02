package com.wfghc.bancodigital.domain.auth

import com.wfghc.bancodigital.data.model.User
import com.wfghc.bancodigital.data.repository.auth.AuthFirebaseDataSourceImpl
import javax.inject.Inject

class RegisterUseCase @Inject constructor(
    private val authFirebaseDataSourceImpl: AuthFirebaseDataSourceImpl
) {
    suspend operator fun invoke(user: User): User {
        return authFirebaseDataSourceImpl.register(user)
    }
}