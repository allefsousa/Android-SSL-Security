package br.com.developer.allefsousa.adorofilmes.di.factory

import com.developer.allef.boilerplateapp.BuildConfig
import okhttp3.CertificatePinner

/**
 * @author allef.santos on 19/06/20
 */
object OkHttpPinnerFactory {
     fun providesPinner(): CertificatePinner = CertificatePinner.Builder()
        .add(BuildConfig.HOST_NAME, "sha256/71c21791a83adc06c5b86cd493f0c4f51bb58f712df6fe0df0f03cd5e466464e")
        .build()

}
