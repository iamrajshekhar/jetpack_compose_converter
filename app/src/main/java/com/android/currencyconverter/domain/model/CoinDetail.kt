package com.android.currencyconverter.domain.model

import com.android.currencyconverter.data.remote.dto.TeamMember

data class CoinDetail(
    val team: List<TeamMember>,
    val tags: List<String>,
    val isActive: Boolean,
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int
)
