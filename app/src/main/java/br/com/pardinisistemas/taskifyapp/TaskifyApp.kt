package br.com.pardinisistemas.taskifyapp

import android.app.Application
import br.com.pardinisistemas.analytics.TaskifyAnalytics

class TaskifyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        TaskifyAnalytics.init(applicationContext)
    }
}