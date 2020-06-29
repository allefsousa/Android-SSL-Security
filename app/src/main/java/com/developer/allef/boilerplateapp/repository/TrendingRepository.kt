package com.developer.allef.boilerplateapp.repository

import com.developer.allef.boilerplateapp.data.StateResult
import com.developer.allef.boilerplateapp.data.dto.RepositoriesDTO
import com.developer.allef.boilerplateapp.data.dto.toRepositories
import com.developer.allef.boilerplateapp.data.model.Repositories
import com.developer.allef.boilerplateapp.service.ApiService

/**
 * @author allef.santos on 27/06/20
 */
class TrendingRepository(private val client: ApiService) :BaseRepository(){

    suspend fun getTrendingRepositories(nameLanguage:String): StateResult<Repositories> {
         val repositoriesDTO = safeApiCall {client.findRepositories(nameLanguage)}
        return when (repositoriesDTO){
            is StateResult.Success ->{
                StateResult.Success(repositoriesDTO.data.toRepositories())
            }
            else -> {
                StateResult.Failure(Throwable("Converter Data Exception"))
            }
        }

    }
}