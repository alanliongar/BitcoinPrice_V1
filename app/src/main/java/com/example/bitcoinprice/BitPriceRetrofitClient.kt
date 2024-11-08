package com.example.bitcoinprice

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_PRICE_URL: String = "https://api.blockchain.com/v3/exchange/"

object BitPriceRetrofitClient {
    val retrofitInstance: Retrofit
        get() {
            return Retrofit.Builder()
                .baseUrl(BASE_PRICE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
}