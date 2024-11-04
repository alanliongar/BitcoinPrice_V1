package com.example.bitcoinprice

import com.google.gson.annotations.SerializedName

@kotlinx.serialization.Serializable
data class BitcoinPriceResponse(
    @SerializedName("values")
    val listOfValues: List<BitcoinPriceDto>
)

@kotlinx.serialization.Serializable
data class BitcoinPriceDto(
    @SerializedName("x")
    val timestamp: Long,
    @SerializedName("y")
    val value: Double
)