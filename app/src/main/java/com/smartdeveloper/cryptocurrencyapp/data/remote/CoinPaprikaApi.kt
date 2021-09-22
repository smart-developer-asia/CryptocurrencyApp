package com.smartdeveloper.cryptocurrencyapp.data.remote

import com.smartdeveloper.cryptocurrencyapp.data.remote.dto.CoinDetaildto
import com.smartdeveloper.cryptocurrencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinbyId(@Path("coinId") coinId: String): CoinDetaildto
}