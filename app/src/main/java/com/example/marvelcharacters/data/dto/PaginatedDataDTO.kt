package com.example.marvelcharacters.data.dto

import com.google.gson.annotations.SerializedName

data class PaginatedDataDTO<T>(
    @SerializedName("offset") var offset: Int? = null,
    @SerializedName("limit") var limit: Int? = null,
    @SerializedName("total") var total: Int? = null,
    @SerializedName("count") var count: Int? = null,
    @SerializedName("results") var results: List<T>? = null
)
