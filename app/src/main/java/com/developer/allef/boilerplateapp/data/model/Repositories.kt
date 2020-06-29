package com.developer.allef.boilerplateapp.data.model

import com.developer.allef.boilerplateapp.data.dto.ItemDTO

/**
 * @author allef.santos on 26/06/20
 */
data class Repositories(
    val statusResult: Boolean,
    val repositories: List<Item>,
    val totalCount: Int
)