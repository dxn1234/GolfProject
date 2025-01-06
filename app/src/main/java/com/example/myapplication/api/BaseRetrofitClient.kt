package com.example.myapplication.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

// use retrofit to call api
object BaseRetrofitClient {
    private var retrofit: Retrofit? = null
    private const val BASE_URL_GET_LIST_IMAGE = "link_api_image"

    val retrofitApi: RetrofitApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL_GET_LIST_IMAGE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RetrofitApi::class.java)
    }
}