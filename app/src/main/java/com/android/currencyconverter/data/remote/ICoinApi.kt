package com.android.currencyconverter.data.remote

import com.android.currencyconverter.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ICoinApi {
    @GET("v1/coins/")
    suspend fun getCoins():List<CoinDto>

    @GET("v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId")coinId:String ):List<CoinDto>
}