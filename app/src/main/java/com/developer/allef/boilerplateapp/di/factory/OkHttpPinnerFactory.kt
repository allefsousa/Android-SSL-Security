package br.com.developer.allefsousa.adorofilmes.di.factory

import com.developer.allef.boilerplateapp.BuildConfig
import okhttp3.CertificatePinner

/**
 * @author allef.santos on 19/06/20
 */
object OkHttpPinnerFactory {
     fun providesPinner(): CertificatePinner = CertificatePinner.Builder()
        .add(BuildConfig.HOST_NAME, "sha256/ORtIOYkm5k6Nf2tgAK/uwftKfNhJB3QS0Hs608SiRmE=")
        .build()

}
