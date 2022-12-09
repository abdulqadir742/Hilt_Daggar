package com.example.hilt_daggar

import android.app.Application
import dagger.Binds
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class UserApplication:Application() {
}