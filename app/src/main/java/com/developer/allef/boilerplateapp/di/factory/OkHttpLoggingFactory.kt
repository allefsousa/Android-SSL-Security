package br.com.developer.allefsousa.adorofilmes.di.factory

import com.developer.allef.boilerplateapp.BuildConfig
import okhttp3.logging.HttpLoggingInterceptor

/**
 * @author allef.santos on 19/06/20
 */
object OkHttpLoggingFactory {
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = if (BuildConfig.DEBUG)
            HttpLoggingInterceptor.Level.BODY
        else
            HttpLoggingInterceptor.Level.NONE
    }


}
