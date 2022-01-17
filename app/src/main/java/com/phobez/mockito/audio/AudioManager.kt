package com.phobez.mockito.audio

class AudioManager {
    var volume = 50
    var mode = RINGER_MODE.RINGER_MODE_SILENT
        private set

    fun makeReallyLoud() {
        if (mode == RINGER_MODE.RINGER_MODE_NORMAL) {
            volume = 100
        }
    }
}