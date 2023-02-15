package com.example.amphibiansapp.network

import com.example.amphibiansapp.model.Amphibian
import retrofit2.http.GET

interface AmphibiansApiService {
    /**
     * Return a [List] of [Amphibian] and called from coroutine.
     * The @GET annotation indicates that the "amphibians" endpoint will be
     * requested with GET HTTP method
     */
    @GET("amphibians")
    suspend fun getAmphibiansJson(): List<Amphibian>
}