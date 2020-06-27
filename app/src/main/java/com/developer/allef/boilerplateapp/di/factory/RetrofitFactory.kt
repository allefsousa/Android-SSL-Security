package br.com.developer.allefsousa.adorofilmes.di.factory

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @author allef.santos on 19/06/20
 */
object RetrofitFactory {
    inline fun <reified T> createWebService(okHttpClient: OkHttpClient, url: String): T {
        return Retrofit.Builder()
            .baseUrl(url)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
            .build()
            .create(T::class.java)
    }
}
