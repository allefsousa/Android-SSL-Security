package com.developer.allef.boilerplateapp.service

import com.developer.allef.boilerplateapp.data.dto.RepositoriesDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author allef.santos on 26/06/20
 */
interface ApiService {

    @GET("search/repositories")
    suspend fun findRepositories(@Query("q") name: String): Response<RepositoriesDTO>


}