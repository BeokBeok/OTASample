package com.beok.otasample

import android.app.Application
import com.lokalise.sdk.Lokalise

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        setupLokalise()
    }

    private fun setupLokalise() {
        Lokalise.init(
            appContext = this,
            sdkToken = TOKEN_LOKALISE_SDK,
            projectId = ID_LOKALISE_PROJECT
        )
    }

    companion object {
        private const val TOKEN_LOKALISE_SDK = "eb4bd30d638393a76b42cabc27346333bfcbca0d"
        private const val ID_LOKALISE_PROJECT = "5159434763482591b5c854.63645149"
    }
}
