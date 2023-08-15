package com.example.marvelcharacters.data.dto

import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(
    @SerializedName("data") val data: T? = null
)