package com.phobez.mockito.audio

class VolumeUtil {

    companion object {
        fun maximiseVolume(audioManager: AudioManager) {
            if (audioManager.mode != RINGER_MODE.RINGER_MODE_SILENT) {
                val max = audioManager.volume

                audioManager.volume = max
            }
        }
    }
}