package com.developer.allef.boilerplateapp.data.dto


import com.developer.allef.boilerplateapp.data.model.License
import com.google.gson.annotations.SerializedName

data class LicenseDTO(
    @SerializedName("key")
    val key: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("node_id")
    val nodeId: String,
    @SerializedName("spdx_id")
    val spdxId: String,
    @SerializedName("url")
    val url: String
)

fun LicenseDTO.toMapperLicense() = (License(
    key, name, nodeId, spdxId, url
))