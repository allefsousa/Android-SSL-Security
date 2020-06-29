package com.developer.allef.boilerplateapp.data

/**
 * @author allef.santos on 27/06/20
 */

sealed class StateResult<out T> {
    data class Success<out T>(val data: T) : StateResult<T>()
    data class Error<out T>(val data: Int) : StateResult<T>()
    data class Failure<out T>(val throwable: Throwable) : StateResult<T>()
}