package com.example.marvelcharacters.data.dto

import com.google.gson.annotations.SerializedName

data class UrlDTO(

    @SerializedName("type") val type: String? = null,
    @SerializedName("url") val url: String? = null

)