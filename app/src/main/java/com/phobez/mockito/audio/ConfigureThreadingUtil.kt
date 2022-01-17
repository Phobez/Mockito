package com.phobez.mockito.audio

class ConfigureThreadingUtil {

    companion object {
        fun configureThreadPool(app: MyApplication) {
            val numberOfThreads = app.getNumberOfThreads()
        }
    }
}