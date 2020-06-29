package com.developer.allef.boilerplateapp.di

import br.com.developer.allefsousa.adorofilmes.di.factory.OkHttpFactory
import br.com.developer.allefsousa.adorofilmes.di.factory.OkHttpLoggingFactory
import br.com.developer.allefsousa.adorofilmes.di.factory.OkHttpPinnerFactory
import br.com.developer.allefsousa.adorofilmes.di.factory.RetrofitFactory
import com.developer.allef.boilerplateapp.BuildConfig
import com.developer.allef.boilerplateapp.repository.TrendingRepository
import com.developer.allef.boilerplateapp.service.ApiService
import com.developer.allef.boilerplateapp.ui.trending.TrendingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * @author allef.santos on 26/06/20
 */

val networkModule = module {
    single { OkHttpLoggingFactory.provideHttpLoggingInterceptor() }
    single { OkHttpPinnerFactory.providesPinner() }
    single { OkHttpFactory.providesOkHttpClient(get(),get()) }
    single { RetrofitFactory.createWebService<ApiService>(get(), BuildConfig.API_BASE) }
}
val repositoryModule = module {
    single { TrendingRepository(get()) }
}
val viewModelModule = module {
    viewModel { TrendingViewModel(get()) }
}