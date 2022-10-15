package com.beok.otasample

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lokalise.sdk.Lokalise
import com.lokalise.sdk.LokaliseContextWrapper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Lokalise.updateTranslations()
    }

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(LokaliseContextWrapper.wrap(newBase ?: return))
    }
}
