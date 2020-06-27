package br.com.developer.allefsousa.adorofilmes.di.factory

import okhttp3.CertificatePinner
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

/**
 * @author allef.santos on 19/06/20
 */
object OkHttpFactory {
    fun providesOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor, certificatePinner: CertificatePinner): OkHttpClient = OkHttpClient().newBuilder()
        .connectTimeout(60, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .writeTimeout(60, TimeUnit.SECONDS)
        .addInterceptor(httpLoggingInterceptor)
        .certificatePinner(certificatePinner)
        .build()

}
