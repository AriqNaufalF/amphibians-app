package com.example.amphibiansapp.data

import com.example.amphibiansapp.model.Amphibian
import com.example.amphibiansapp.network.AmphibiansApiService

// Repository that fetch amphibians list from amphibiansApi
interface AmphibiansRepository {
    suspend fun getAmphibians(): List<Amphibian>
}

/**
 * Network implementation of Amphibians Repository
 */
class NetworkAmphibiansRepository(
    private val amphibiansApiService: AmphibiansApiService
) : AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> = amphibiansApiService.getAmphibiansJson()
}
