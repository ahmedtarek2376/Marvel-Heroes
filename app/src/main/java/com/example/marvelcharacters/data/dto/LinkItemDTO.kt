package com.example.marvelcharacters.data.dto

import com.google.gson.annotations.SerializedName

data class LinkItemDTO(

    @SerializedName("resourceURI") val resourceURI: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("type") val type: String? = null

)