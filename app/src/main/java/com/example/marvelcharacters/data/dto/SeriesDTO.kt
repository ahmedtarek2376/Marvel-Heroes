package com.example.marvelcharacters.data.dto

import com.google.gson.annotations.SerializedName

data class SeriesDTO(

    @SerializedName("available") val available: Int? = null,
    @SerializedName("collectionURI") val collectionURI: String? = null,
    @SerializedName("items") val items: ArrayList<LinkItemDTO> = arrayListOf(),
    @SerializedName("returned") val returned: Int? = null

)