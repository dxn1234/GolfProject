package com.example.myapplication.api

import com.example.myapplication.model.InfoImage
import retrofit2.Call
import retrofit2.http.GET

// declare annotation(GET, POST, PUT, DELETE) request api
interface RetrofitApi {
    // Because get list image from api should use annotation @GET
    @GET("info-image") // link endpoint (customize by API)
    suspend fun getListInfoImage(): ArrayList<InfoImage>
}