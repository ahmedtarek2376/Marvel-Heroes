package com.example.marvelcharacters.data.dto

import com.google.gson.annotations.SerializedName

data class HeroDTO(

    @SerializedName("id") val id: Int? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("thumbnail") val thumbnail: ThumbnailDTO? = null,
    @SerializedName("resourceURI") val resourceURI: String? = null,
    @SerializedName("comics") val comics: ComicDTO? = null,
    @SerializedName("series") val series: SeriesDTO? = null,
    @SerializedName("stories") val stories: StoryDTO? = null,
    @SerializedName("events") val events: EventDTO? = null,
    @SerializedName("urls") val urls: List<UrlDTO>? = null

)













