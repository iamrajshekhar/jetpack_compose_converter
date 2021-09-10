package com.android.currencyconverter.data.remote.dto

import com.android.currencyconverter.domain.model.Coin
import com.google.gson.annotations.SerializedName


data class CoinDto(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)


fun CoinDto.toCoin(): Coin{
    return Coin(id = id, rank =rank,isActive = isActive, name = name , symbol = symbol)

}

