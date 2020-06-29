package com.developer.allef.boilerplateapp.repository

import com.developer.allef.boilerplateapp.data.StateResult
import retrofit2.Response
import java.lang.Exception

/**
 * @author allef.santos on 27/06/20
 */
open class BaseRepository {
    suspend fun <T : Any> safeApiCall(call: suspend () -> Response<T>): StateResult<T> {
        return safeApiResult(call)
    }

    private suspend fun <T : Any> safeApiResult(call: suspend () -> Response<T>): StateResult<T> {

        return try {
            val response = call.invoke()
            if (response.isSuccessful) {
                StateResult.Success(response.body()!!)
            }else{
                StateResult.Error(response.code())
            }
        }catch (e:Exception){
            StateResult.Failure(e)
        }

    }
}