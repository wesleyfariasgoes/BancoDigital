package com.wfghc.bancodigital.repository.auth

interface AuthFirebaseDataSource {
    suspend fun login(email: String, password: String)
    suspend fun register(nome: String, email: String, phone: String, password: String)
    suspend fun recover(email: String)
}