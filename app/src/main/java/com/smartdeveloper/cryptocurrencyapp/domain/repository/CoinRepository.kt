package com.smartdeveloper.cryptocurrencyapp.domain.repository

import com.smartdeveloper.cryptocurrencyapp.data.remote.dto.CoinDetaildto
import com.smartdeveloper.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetaildto
}