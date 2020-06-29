package com.developer.allef.boilerplateapp.data.dto


import com.developer.allef.boilerplateapp.data.model.Item
import com.developer.allef.boilerplateapp.data.model.Repositories
import com.google.gson.annotations.SerializedName


data class RepositoriesDTO(
    @SerializedName("incomplete_results")
    val incompleteResults: Boolean,
    @SerializedName("items")
    val items: List<ItemDTO>,
    @SerializedName("total_count")
    val totalCount: Int
)

internal fun RepositoriesDTO.toRepositories(): Repositories {
    return (Repositories(
        incompleteResults,
        items.toMapperListItem(),
        totalCount
    ))

}

internal fun <E> List<E>.toMapperListRepositories(): List<Repositories> {
    val listItem = mutableListOf<Repositories>()
    this.forEach {
        when (it) {
            is RepositoriesDTO -> {
                listItem.add(it.toRepositories())
            }
        }
    }
    return listItem
}
















