package com.wfghc.bancodigital.data.repository.auth

import com.wfghc.bancodigital.data.model.User

interface AuthFirebaseDataSource {
    suspend fun login(
        email: String, password: String
    )

    suspend fun register(
        user: User
    ): User

    suspend fun recover(
        email: String
    )
}