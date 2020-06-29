package com.developer.allef.boilerplateapp.repository

import com.developer.allef.boilerplateapp.data.StateResult
import com.developer.allef.boilerplateapp.data.dto.RepositoriesDTO
import com.developer.allef.boilerplateapp.service.ApiService

/**
 * @author allef.santos on 27/06/20
 */
class TrendingRepository(private val client: ApiService) :BaseRepository(){

    suspend fun getTrendingRepositories(nameLanguage:String): StateResult<RepositoriesDTO> {
        return safeApiCall {client.findRepositories(nameLanguage)}
    }
}