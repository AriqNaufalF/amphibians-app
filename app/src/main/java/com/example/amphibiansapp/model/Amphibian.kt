package com.example.amphibiansapp.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This data class define a Amphibians data
 */
@Serializable
data class Amphibian(
    val name: String,
    val type: String,
    val description: String,
    @SerialName(value = "img_src")
    val imgSrc: String
)
