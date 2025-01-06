package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

class InfoImage(
    @SerializedName("imageId")
    var imageId: String,
    @SerializedName("imageUrl")
    var imageUrl: String,
    var isFavorite: Boolean
)