package com.developer.allef.boilerplateapp.data

/**
 * @author allef.santos on 27/06/20
 */

sealed class Result<out T> {
    class Loading<out T> : Result<T>()
    data class Success<out T>(val data: T) : Result<T>()
    data class Error<out T>(val data: T) : Result<T>()
    data class Failure<out T>(val throwable: Throwable) : Result<T>()
}