package com.developer.allef.boilerplateapp

import android.app.Application
import androidx.multidex.BuildConfig
import com.developer.allef.boilerplateapp.di.networkModule
import com.developer.allef.boilerplateapp.di.repositoryModule
import com.developer.allef.boilerplateapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

/**
 * @author allef.santos on 2019-11-21
 */
class appApplication :Application(){

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
        startKoin {
            androidLogger()
            androidContext(this@appApplication)
            modules(listOf(viewModelModule, repositoryModule,networkModule))
        }
    }
}