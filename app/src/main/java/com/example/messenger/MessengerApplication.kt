package com.example.messenger

import android.app.Application
import com.example.messenger.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MessengerApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(applicationContext)
            modules(
                listOf(
                    apiModule,
                    dataBaseModule,
                    dataSourceModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}