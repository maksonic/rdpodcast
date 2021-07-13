package com.maksonic.rdpodcast

import android.app.Application
import com.maksonic.rdpodcast.data.di.dataModule
import com.maksonic.rdpodcast.domain.di.domainModule
import com.maksonic.rdpodcast.presentation.di.presentationModule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import kotlin.time.ExperimentalTime


/**
 * @Author: maksonic on 13.07.2021
 */

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(
                listOf(
                    dataModule,
                    domainModule,
                    presentationModule,
                )
            )
        }
    }
}
