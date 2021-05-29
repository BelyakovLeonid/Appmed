package com.github.belyakovleonid.appmed.base

import android.app.Application
import com.github.belyakovleonid.appmed.base.di.DaggerAppComponent

class MedApp : Application() {

    val appComponent by lazy { DaggerAppComponent.create() }
}