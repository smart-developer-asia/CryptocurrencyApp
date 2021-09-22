package com.smartdeveloper.cryptocurrencyapp.data.repository

import com.smartdeveloper.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.smartdeveloper.cryptocurrencyapp.data.remote.dto.CoinDetaildto
import com.smartdeveloper.cryptocurrencyapp.data.remote.dto.CoinDto
import com.smartdeveloper.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetaildto {
        return api.getCoinbyId(coinId)
    }
}