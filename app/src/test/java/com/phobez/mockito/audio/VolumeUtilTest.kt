package com.phobez.mockito.audio

import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.*

class VolumeUtilTest {

    @Mock
    private lateinit var audioManager: AudioManager

    @Test
    fun testNormalRingerIsMaximised() {
        audioManager = mock(AudioManager::class.java)
        `when`(audioManager.mode).thenReturn(RINGER_MODE.RINGER_MODE_NORMAL)
        `when`(audioManager.volume).thenReturn(100)

        VolumeUtil.maximiseVolume(audioManager)

        verify(audioManager).volume
    }

    @Test
    fun testSilentRingerIsNotDisturbed() {
        audioManager = mock(AudioManager::class.java)
        `when`(audioManager.mode).thenReturn(RINGER_MODE.RINGER_MODE_SILENT)

        VolumeUtil.maximiseVolume(audioManager)

        verify(audioManager).mode
        verifyNoMoreInteractions(audioManager)
    }
}